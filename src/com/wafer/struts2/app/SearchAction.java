package com.wafer.struts2.app;

import com.opensymphony.xwork2.ActionContext;
import com.wafer.struts2.Config;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * This is the SearchAction class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 17/1/2 00:28
 */
public class SearchAction {

    private String studentId = "";
    private String studentNumber = "";

    public String search() throws SQLException {
        Connection connection = Config.getConnection();

        //language=MySQL
        String sql = "SELECT student_id,student_num FROM Student";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            if (studentId.equals(resultSet.getString("student_id"))) {
                studentNumber = resultSet.getString("student_num");

                ActionContext.getContext().put("studentId", studentId);
                ActionContext.getContext().put("studentNumber", studentNumber);

                return "SUCCESS";
            }
        }

        return "NOT_FOUND";
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}

package com.wafer.struts2.app;

import com.opensymphony.xwork2.ActionSupport;
import com.wafer.struts2.Config;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * This is the LoginAction class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 17/1/1 22:57
 */
public class LoginAction extends ActionSupport{

    private String id;
    private String password;

    public String login() throws SQLException {
        //language=MySQL
        String sql = "SELECT id FROM User";

        Connection connection = Config.getConnection();

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
           String currentId = resultSet.getString("id");
           if (currentId.equals(id)) {
               statement.close();
               connection.close();
               return SUCCESS;
           }
        }

        statement.close();
        connection.close();
        return ERROR;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

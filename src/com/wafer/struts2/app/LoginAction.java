package com.wafer.struts2.app;

import com.opensymphony.xwork2.ActionSupport;
import com.wafer.struts2.Config;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class LoginAction {

    private String id;
    private String password;

    public String register() throws SQLException {
        //language=MySQL
        String sql = "INSERT INTO User(id, password) VALUES (?, ?)";

        Connection connection = Config.getConnection();

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setObject(1, id);
        statement.setObject(2, password);

        if(statement.executeUpdate() > 0) {
            return "SUCCESS";
        }

        return "ERROR";
    }

    public String login() throws SQLException {
        //language=MySQL
        String sql = "SELECT id, password FROM User";

        Connection connection = Config.getConnection();

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
           String currentId = resultSet.getString("id");
           String currentPassword = resultSet.getString("password");
           if (currentId.equals(id) && currentPassword.equals(password)) {
               statement.close();
               connection.close();
               global.isLogin = true;
               return "SUCCESS";
           }
        }

        statement.close();
        connection.close();
        return "ERROR";
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

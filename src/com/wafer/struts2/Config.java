package com.wafer.struts2;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This is the Config class
 * Please put some info here.
 *
 * @author Wafer Li
 * @since 17/1/1 23:13
 */
public class Config {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/struts2?useUnicode=true&characterEncoding=UTF-8";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "12345678";

    public static Connection getConnection() throws SQLException {
        Driver driver = new com.mysql.jdbc.Driver();
        return DriverManager.getConnection(JDBC_URL, USER_NAME, PASSWORD);
    }
}

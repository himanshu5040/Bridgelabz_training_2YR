package com.jdbc.StudentDatabase;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionImpl implements IConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/dsa";
    private static final String USER = "root";
    private static final String PASSWORD = "Himanshu9068";

    @Override
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

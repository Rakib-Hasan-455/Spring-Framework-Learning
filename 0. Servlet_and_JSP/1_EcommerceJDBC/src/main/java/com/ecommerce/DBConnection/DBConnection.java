package com.ecommerce.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private Connection connection = null;
    private String DB_NAME = "ecommerce_jdbc";
    private String USERNAME = "root";
    private String PASSWORD = "admin";

    public Connection getConnections() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/"+DB_NAME,
                    USERNAME,
                    PASSWORD);
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public boolean checkConnection() {
        return connection != null;
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package com.ecommerce.DAO_DataAccessObject;

import com.ecommerce.DBConnection.DBConnection;
import com.ecommerce.Model.UserTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO extends DBConnection{

    public UserTable userLogin(String email, String password) {
        UserTable userTable = null;
        Connection connection = getConnections();
        try {
            String query = "SELECT * FROM USERS WHERE EMAIL = ? AND PASSWORD = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                userTable = new UserTable();
                userTable.setId(resultSet.getInt("id"));
                userTable.setEmail(resultSet.getString("email"));
                userTable.setName(resultSet.getString("name"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userTable;
    }
}

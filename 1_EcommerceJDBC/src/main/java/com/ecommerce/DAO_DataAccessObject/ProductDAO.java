package com.ecommerce.DAO_DataAccessObject;

import com.ecommerce.DBConnection.DBConnection;
import com.ecommerce.Model.ProductTable;
import com.ecommerce.Model.UserTable;

import javax.servlet.http.Part;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO extends DBConnection {

    public ProductTable addProduct(String pName, String pCategory, int pPrice, String pImage) {
        ProductTable productTable = null;
        Connection connection = getConnections();

        try {
            productTable = new ProductTable();
            String query = "INSERT INTO PRODUCTS (NAME, CATEGORY, PRICE, IMAGE) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, pName);
            preparedStatement.setString(2, pCategory);
            preparedStatement.setInt(3, pPrice);
            preparedStatement.setString(4, pImage);
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productTable;
    }

    public List<ProductTable> showProducts() {
        List<ProductTable> productsList = new ArrayList<>();
        Connection connection = getConnections();
        try {
            String query = "SELECT * FROM PRODUCTS";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ProductTable productTable = new ProductTable();
                productTable.setpName(resultSet.getString("name"));
                productTable.setpCategory(resultSet.getString("category"));
                productTable.setpPrice(resultSet.getInt("price"));
                productTable.setpImage(resultSet.getString("image"));
                productsList.add(productTable);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productsList;
    }
}

package com.Login._LoginForm;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String name = request.getParameter("username");
        String pass = request.getParameter("password");
        Connection connection = DBConnection.getConnections();
        try {

            if (name.isEmpty() || pass.isEmpty()) {
                PrintWriter out = response.getWriter();
                out.println(" Field Can't be empty ");
            } else {
                String sql = "SELECT * FROM CUSTOMERINFO WHERE NID = ? AND PASSWORD = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, pass);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    HttpSession session = request.getSession();
                    session.setAttribute("uname", name);
                    response.sendRedirect("Home.jsp");
                   } else {
                    response.sendRedirect("index.jsp");
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DBConnection.closeConnections();
        }
    }

}
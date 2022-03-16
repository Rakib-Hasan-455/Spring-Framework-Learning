package com.ecommerce.Controller_Servlets;

import com.ecommerce.DAO_DataAccessObject.UserDAO;
import com.ecommerce.Model.UserTable;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "UserLoginServlet", value = "/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        String email = request.getParameter("user_email");
        String password = request.getParameter("user_pass");

        UserDAO userDAO = new UserDAO();
        UserTable userTable = userDAO.userLogin(email, password);

        if (userTable != null) {
            request.getSession().setAttribute("auth", userTable);
            response.sendRedirect("index.jsp");
        } else {
            out.println("Your Username or Password is Incorrect");
        }
    }
}

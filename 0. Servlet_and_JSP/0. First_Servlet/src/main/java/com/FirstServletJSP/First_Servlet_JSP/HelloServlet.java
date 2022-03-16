package com.FirstServletJSP.First_Servlet_JSP;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet("/Add")
public class HelloServlet extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));

        int addResult = i + j;
       PrintWriter out = response.getWriter();
//        out.println("Result is = " + addResult);*/

        int squareResult = (int) Math.pow(addResult, 2);
        // Session Management -> sending data to DoSquare
        /*request.setAttribute("k_key", squareResult);*/

        // Request Dispatcher
        /*RequestDispatcher requestDispatcher = request.getRequestDispatcher("squareServlet");
        requestDispatcher.forward(request, response);*/


        // Call another servlet with Send Redirect
        /*response.sendRedirect("squareServlet?squareResult=" + squareResult);*/


        // Sending data with httpsession & Send Redirect
        /*HttpSession session = request.getSession();
        session.setAttribute("squareResult", squareResult);
        response.sendRedirect("squareServlet");*/

        // Sending data with cookie & send redirect
        /*Cookie cookie = new Cookie("squareResult", squareResult+"");
        response.addCookie(cookie);
        response.sendRedirect("squareServlet");*/

        // Servlet Config and Servlet Context

        // Servlet Context
        ServletContext ctx = getServletContext();
        String name = ctx.getInitParameter("personName");
        out.println(" Your servlet context name is " + name);


        // Servlet Config
        ServletConfig sc = getServletConfig();
        String name1 = sc.getInitParameter("personName");
        out.println(" Your servlet config name is " + name1);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));

        int addResult = i + j;

        PrintWriter writeInBrowser = response.getWriter();
        writeInBrowser.println("Result is = " + addResult);
    }

    public void destroy() {
    }
}
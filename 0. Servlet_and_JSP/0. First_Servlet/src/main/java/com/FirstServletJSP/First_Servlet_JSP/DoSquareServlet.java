package com.FirstServletJSP.First_Servlet_JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/squareServlet")
public class DoSquareServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*int squareResult = (int) request.getAttribute("k_key");
        PrintWriter out = response.getWriter();
        out.println(" Yow This is Square Servlet");
        out.println("The results square result is " + squareResult );*/

        // Send Request response
        /*int squareResult = Integer.parseInt(request.getParameter("squareResult"));
        PrintWriter out = response.getWriter();
        out.println(" Yow This is Square Servlet with Request Response");
        out.println("The results square result is " + squareResult );*/

        // Http Session
        /*
        HttpSession session = request.getSession();
        int squareResult = (int) session.getAttribute("squareResult");

        PrintWriter out = response.getWriter();
        out.println(" Yow This is Square Servlet with HTTP Session");
        out.println("The results square result is " + squareResult );
        session.removeAttribute("squareResult");*/

        // Cookie
        Cookie cookies[] = request.getCookies();
        int squareResult = 0;
        for (Cookie cookie: cookies) {
            if (cookie.getName().equals("squareResult")) {
                squareResult = Integer.parseInt(cookie.getValue());
            }
        }
        PrintWriter out = response.getWriter();
        out.println(" Yow This is Square Servlet with Cookie");
        out.println("The results square result is " + squareResult );

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* PrintWriter out = response.getWriter();
        out.println(" Yow This is Square Servlet");*/
    }
}

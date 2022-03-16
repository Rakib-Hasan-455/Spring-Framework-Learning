<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.ecommerce.Model.UserTable" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<% UserTable auth = (UserTable) request.getSession().getAttribute("auth");
    if (auth != null) {
        request.setAttribute("auth", auth);
    }
%>
<!DOCTYPE html>
<html>
<head>

    <title>Welcome To Our Shop</title>
    <%@ include file="Includes/header.jsp"%>
</head>
<body>
<%@include file="Includes/navbar.jsp"%>
<p style="color: red"> Orders </p>
<%@ include file="Includes/Footer.jsp"%>
</body>
</html>
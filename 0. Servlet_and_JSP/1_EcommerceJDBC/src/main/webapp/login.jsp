<%@ page import="com.ecommerce.Model.UserTable" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% UserTable auth = (UserTable) request.getSession().getAttribute("auth");
    if (auth != null) {
        response.sendRedirect("index.jsp");
    }
%>
<!DOCTYPE html>
<html>
<head>

    <title>Login Page</title>
    <style>
        body{
            background-image: url("image/HMSHOME.jpg");
            background-size: cover;
            background-attachment: fixed;
        }
    </style>
    <%@ include file="Includes/header.jsp"%>
</head>
<body>
<%@include file="Includes/navbar.jsp"%>

<div class="container">
<div class="card w-50 mx-auto my-5">
    <div class="card-header text-center">
        User Login
    </div>
    <div class="card-body">
    <form action="${pageContext.request.contextPath}/UserLoginServlet" method="post">
        <div class="form-group">
            <label> Email Address </label>
            <input class="form-control" name="user_email" type="email" required placeholder="Email">
        </div>
        <div class="form-group">
            <label> Your Password </label>
            <input class="form-control" name="user_pass" type="password" required placeholder="Password">
        </div>
        <div class="text-center">
        <button class="btn btn-primary" type="submit"> Login </button>
        </div>
    </form>
    </div>
</div>
</div>
<%@ include file="Includes/Footer.jsp"%>
</body>
</html>
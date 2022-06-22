<%--
  Created by IntelliJ IDEA.
  User: Rakib
  Date: 6/21/2022
  Time: 3:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/resources/css/style1.css"/>" rel="stylesheet">
</head>
<body>
<h1> Thanks for uploading </h1>
<h2> Uploaded File: </h2>
<img src="<c:url value="/resources/images/${filename}"/>" alt="uploaded file">
<br><br>
<a href="http://localhost:8080"> Upload again! </a> <br>
</body>
</html>

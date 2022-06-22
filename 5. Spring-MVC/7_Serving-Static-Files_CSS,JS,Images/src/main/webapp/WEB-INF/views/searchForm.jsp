<%--
  Created by IntelliJ IDEA.
  User: Rakib
  Date: 6/21/2022
  Time: 3:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/resources/css/style1.css"/>" rel="stylesheet">
</head>
<body>
<form action="/search" method="post">
    <input name="searchtext" placeholder="search anything">
    <button type="submit">Search</button>
</form>
</body>
</html>

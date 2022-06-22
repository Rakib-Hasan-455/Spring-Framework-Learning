<%--
  Created by IntelliJ IDEA.
  User: Rakib
  Date: 6/20/2022
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
    <link href="<c:url value="resources/css/style1.css"/>" rel="stylesheet">
</head>
<body>
<h1> THis is google search page </h1>
<%--<a href="/searchForm"> Click to search anything</a>--%>
<br><br>
<form action="/search" method="post">
    <input name="searchtext" placeholder="search anything">
    <button type="submit">Search</button>
</form>
</body>
</html>

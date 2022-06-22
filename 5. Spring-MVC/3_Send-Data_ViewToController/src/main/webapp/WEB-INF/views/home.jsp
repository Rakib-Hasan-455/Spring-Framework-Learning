<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Rakib
  Date: 6/20/2022
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#e0ffff">
<h1> ${head}</h1>
<h1> This is home </h1>
<a href="http://localhost:8080"> go to main page </a>
<%
     String name = (String) request.getAttribute("name");
     int id = (Integer) request.getAttribute("id");
    ArrayList<String> friendList = (ArrayList<String>) request.getAttribute("friendList");
%>

<h2> My name is <%=name%>  </h2>
<h2> My id is <%=id%> </h2>

<h2> My friends </h2>
<% for (String friend : friendList) {
    %>
<h2> <%=friend%> </h2>
<%
}
%>

<h1> Using Expression Language </h1>
<h2> My name is ${name}  </h2>
<h2> My id is ${id} </h2>
<h2> Friends = ${friendList}</h2>

<h1> For loop arraylist Using JSTL Taglib</h1>
<c:forEach var="item" items="${friendList}">
    <h1> ${item}</h1>
</c:forEach>
</body>
</html>

<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Rakib
  Date: 6/20/2022
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#e0ffff">
<h1> This is home </h1>
<a href="http://localhost:8080"> go to main page </a>
<%
     String name = (String) request.getAttribute("name");
     int id = (Integer) request.getAttribute("id");
    ArrayList<String> friendList = (ArrayList<String>) request.getAttribute("friendList");
%>

<h1> My name is <%=name%>  </h1>
<h1> My id is <%=id%> </h1>

<h1> My friends </h1>
<% for (String friend : friendList) {
    %>
<h1> <%=friend%> </h1>
<%
}
%>
</body>
</html>

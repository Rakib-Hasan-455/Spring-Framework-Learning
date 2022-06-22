<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: Rakib
  Date: 6/20/2022
  Time: 3:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  String name = (String) request.getAttribute("name");
  int id = (Integer) request.getAttribute("id");
    LocalDateTime localDateTime = (LocalDateTime) request.getAttribute("currentTime");
%>


<h2> Hi I am <%=name%></h2>
<h1> You can get any help from me</h1>
<h2> My id <%=id%></h2>
<h1> Current time <%=localDateTime.toLocalTime()%></h1>
<a href="http://localhost:8080"> go to main page </a>

<h1> Using JSTL </h1>
<h2> Hi I am ${name}</h2>
<h1> You can get any help from me</h1>
<h2> My id ${id}</h2>
<h1> Current time ${currentTime.toLocalTime().toString()}</h1>
</body>
</html>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%-- Directive --%>
<%@ page import="java.io.*, javax.servlet.http.*, javax.servlet.annotation.*"%>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body bgcolor="#e0ffff">

<%-- Declaration  --%>
<%! public int outSideService = 10; %>

<%-- Scriptlet --%>
<%
    PrintWriter out1 = response.getWriter();
    int insideService = 10;
    out1.println(" Inside Service method" + insideService);
%>

<%-- Expression --%>
<h1><%= "Hello World! Expression Value = " + outSideService %></h1><br>
<p> Yoo Outside service value is = <%=outSideService%></p>
<p color = "cyan"> Scriptlet | Declaration | Directive | Expression </p>

<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="com.Login._LoginForm.DBConnection" %>
<%@ page import="java.io.PrintWriter" %>
<%--
  Created by IntelliJ IDEA.
  User: Rakib
  Date: 3/3/2022
  Time: 12:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Room Check</title>
</head>
<body>

<%
    if (session.getAttribute("uname") == null) {
        response.sendRedirect("index.jsp");
    }
%>
<p> Check Rooms </p>
<table border="1">
    <tr>
        <th>RoomNo</th>
        <th>Room Type</th>
        <th>Capacity</th>
        <th>Price Day</th>
        <th>Status</th>
    </tr>
<%
try{
    Connection connection = DBConnection.getConnections();
        if(!connection.isClosed()){
            String sql = "SELECT * FROM ROOMINFO ORDER BY STATUS";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String ROOMNO = resultSet.getString("ROOM_NO"); //SQL COL NAMES NID
                String TYPE = resultSet.getString("TYPE");
                String CAPACITY = resultSet.getString("CAPACITY");
                String PRICEDAY = resultSet.getString("PRICE_DAY");
                String STATUS = resultSet.getString("STATUS");
                %>
    <tr>
        <td><%=ROOMNO %></td>
        <td><%=TYPE%></td>
        <td><%=CAPACITY%></td>
        <td><%=PRICEDAY%></td>
        <td><%=STATUS%></td>
    <%
            }

        }
    } catch (SQLException throwables) {
        throwables.printStackTrace();
    } finally {
        DBConnection.closeConnections();
    }
    %>

</TABLE>
</body>
</html>

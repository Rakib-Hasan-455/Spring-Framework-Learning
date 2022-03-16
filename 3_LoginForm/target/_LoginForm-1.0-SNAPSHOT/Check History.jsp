<%@ page import="com.Login._LoginForm.DBConnection" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: Rakib
  Date: 3/3/2022
  Time: 12:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Check History</title>
</head>
<body>

<%
    if (session.getAttribute("uname") == null) {
        response.sendRedirect("index.jsp");
    }
%>
<p> Check History </p>

<table border="1">
    <tr>
        <th>NID</th>
        <th>RoomNo</th>
        <th>CheckedInDate</th>
        <th>CheckedOutDate</th>
        <th>Status</th>
        <th>TotalPrice</th>
    </tr>
    <%
        try{
            Connection connection = DBConnection.getConnections();
            if(!connection.isClosed()){
                String sql = "SELECT * FROM CHECKINOUTINFO WHERE NID = ? ORDER BY SI_NO DESC";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, (String) session.getAttribute("uname"));
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()){
                    String NID = resultSet.getString("NID");
                    String RoomNo = resultSet.getString("ROOMNO");
                    String CheckedInDate = resultSet.getString("CHECKEDIN");
                    String CheckedOutDate = resultSet.getString("CHECKEDOUT");
                    String PriceDay = resultSet.getString("PRICEDAY");
                    String TotalPrice = resultSet.getString("TOTALPRICE");
    %>
    <tr>
        <td><%=NID %></td>
        <td><%=RoomNo%></td>
        <td><%=CheckedInDate%></td>
        <td><%=CheckedOutDate%></td>
        <td><%=PriceDay%></td>
        <td><%=TotalPrice%></td>
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

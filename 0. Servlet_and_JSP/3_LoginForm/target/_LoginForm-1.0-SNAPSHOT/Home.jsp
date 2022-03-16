<%--
  Created by IntelliJ IDEA.
  User: Rakib
  Date: 3/2/2022
  Time: 8:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <table>
        <tr>
            <td>
                <form action="${pageContext.request.contextPath}/RoomCheckServlet" method="get">
                    <button type="submit"> Room Check </button>
                </form>
            </td>
            <td>
                <form action="${pageContext.request.contextPath}/CheckHistoryServlet" method="get">
                    <button type="submit"> Check History </button>
                </form>
            </td>
            <td>
                <form action="${pageContext.request.contextPath}/LogOutServlet" method="get">
                    <button type="submit"> Log Out </button>
                </form>
            </td>
        </tr>
    </table>
</div>
<%
    if (session.getAttribute("uname") == null) {
        response.sendRedirect("index.jsp");
    }
    %>
<h1> Hey ${uname}</h1>
<h1> Welcome to Hotel Management System</h1>

</body>
</html>

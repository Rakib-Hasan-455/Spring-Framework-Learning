<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        .formContainer{
            width: 30%;
            border: 1px solid black;
            margin: auto;
            padding: 20px;
            font-size: 20px;
            background-color: lightcyan;
        }
        body{
            background-image: url("image/HMSHOME.jpg");
            background-size: cover;
            background-attachment: fixed;
        }
    </style>
</head>
<body>

<div class="formContainer">
    <h3 align="center"> Login </h3>
    <form action="hello-servlet" method="get">
        <table>
            <tr>
                <td> User Name: </td>
                <td> <input name="username" type="text"></td>
            </tr>
            <tr>
                <td> Password: </td>
                <td> <input name="password" type="password"></td>
            </tr>
            <tr align="center">
                <td></td>
                <td> <button type="submit"> Login </button> </td>
            </tr>
            <tr align="center">
                <td></td>
                <td> <a href="${pageContext.request.contextPath}/RegisterServlet" style="color: black"> Sign-Up! </a> </td>
            </tr>
        </table>
    </form>
</div>
<a href="AboutUs.jsp" style="color: white; alignment: center"> About Us </a>
</body>
</html>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Project.Model.Patient" %><%--
  Created by IntelliJ IDEA.
  User: Rakib
  Date: 6/22/2022
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />

    <title>Title</title>
</head>
<body>
<h2> List of all patients </h2>
<table style="border: 1px solid black">
    <tr style="border: 1px solid black">
        <th style="border: 1px solid black">Patient ID</th>
        <th style="border: 1px solid black">Patient Name</th>
        <th style="border: 1px solid black">Patient Age</th>
        <th style="border: 1px solid black">Patient Phone No.</th>
        <th style="border: 1px solid black">Action</th>
    </tr>

    <c:forEach items="${patients}" var="patient">
        <tr>
            <td style="border: 1px solid black">${patient.id}</td>
            <td style="border: 1px solid black">${patient.patientName}</td>
            <td style="border: 1px solid black">${patient.patientAge}</td>
            <td style="border: 1px solid black">${patient.patientPhone}</td>
            <td style="border: 1px solid black" align="center" padding="1px">
                <a href="delete/${patient.id}"><i class="fa-regular fa-trash-can"></i></a>
                <a href="update/${patient.id}"><i class="fa-regular fa-pen-to-square"></i></a>

            </td>
        </tr>
    </c:forEach>
</table>
<br><br>
<a href="http://localhost:8080"> Go to Home </a>

</body>
</html>

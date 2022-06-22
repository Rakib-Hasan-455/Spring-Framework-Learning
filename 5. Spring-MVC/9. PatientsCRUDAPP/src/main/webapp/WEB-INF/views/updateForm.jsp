<%--
  Created by IntelliJ IDEA.
  User: Rakib
  Date: 6/20/2022
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
    <link href="<c:url value="../../resources/css/style1.css"/>" rel="stylesheet">
</head>
<body>
<h1> Patient Update Page </h1>
 <br>
<form action="/updateAndViewPatients" method="post">
    <fieldset>
        <legend> Update Patients Info </legend>
        <input style="margin: 4px" type="hidden" name="id" value="${patientt.id}"><br>
        <label style="margin: 2px"> PatientName: </label> <input style="margin: 4px" type="text" name="patientName" value="${patientt.patientName}" required><br>
        <label style="margin: 2px"> Patient Age: </label> <input style="margin: 4px" type="number" name="patientAge" value="${patientt.patientAge}" required><br>
        <label style="margin: 2px"> Phone No: </label> <input style="margin: 4px" type="number" name="patientPhone" value="${patientt.patientPhone}" required><br>
        <button type="submit">Submit</button>
    </fieldset>
</form>
<a href="/viewPatients"> Click here </a> to see all patients signup </h3>
</body>
</html>

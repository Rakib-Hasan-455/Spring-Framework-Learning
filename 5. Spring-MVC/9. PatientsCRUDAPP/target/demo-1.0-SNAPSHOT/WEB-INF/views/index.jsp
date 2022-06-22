<%--
  Created by IntelliJ IDEA.
  User: Rakib
  Date: 6/20/2022
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
    <link href="<c:url value="../../resources/css/style1.css"/>" rel="stylesheet">
</head>
<body>
<h1> THis is Patient Signup Page </h1>
 <br>
<form action="signup" method="post">
    <fieldset>
        <legend> Add Patients Info </legend>
        <label style="margin: 2px"> PatientName: </label> <input style="margin: 4px" type="text" name="patientName" required><br>
        <label style="margin: 2px"> Patient Age: </label> <input style="margin: 4px" type="number" name="patientAge" required><br>
        <label style="margin: 2px"> Phone No: </label> <input style="margin: 4px" type="number" name="patientPhone" required><br>
        <button type="submit">Submit</button>
    </fieldset>

</form>
<a href="/viewPatients"> Click here </a> to see all patients signup </h3>
</body>
</html>

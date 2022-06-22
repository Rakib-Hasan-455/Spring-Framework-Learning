<%--
  Created by IntelliJ IDEA.
  User: Rakib
  Date: 6/20/2022
  Time: 5:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> ${head}</h1>
<h1> Thanks for submitting...</h1>
<h1 style="color: green"> User created with id = ${userID}</h1>

<h2> Your name ${user.name}</h2>
<h2> Your age ${user.age} </h2>
<h2> To submit another form <a href="/contact"> click here </a> </h2>
</body>
</html>

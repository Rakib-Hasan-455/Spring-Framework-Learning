<%@ page import="com.ecommerce.Model.UserTable" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% UserTable auth = (UserTable) request.getSession().getAttribute("auth");
    if (auth != null) {
        request.setAttribute("auth", auth);
    }
%>
<html>
<head>
    <%@ include file="Includes/header.jsp"%>
    <title>Add Product</title>
</head>
<body>
<%@include file="Includes/navbar.jsp"%>
<div class="container">
    <div class="card w-50 mx-auto my-5">
        <div class="card-header text-center">
            Add Product
        </div>
        <div class="card-body">
            <form action="${pageContext.request.contextPath}/AddProductsServlet" method="post" enctype="multipart/form-data">
                <div class="form-group">
                    <label> Product Name </label>
                    <input class="form-control" name="productName" type="text" required placeholder="Product Name">
                </div>
                <div class="form-group">
                    <label> Product Category </label>
                    <input class="form-control" name="productCategory" type="text" required placeholder="Category">
                </div>
                <div class="form-group">
                    <label> Product Price </label>
                    <input class="form-control" name="productPrice" type="number" required placeholder="Price">
                </div>
                <div class="form-group">
                    <label> Product Image </label>
                    <input class="form-control" name="productImage" type="file" required placeholder="Upload Image">
                </div>
                <div class="text-center">
                    <button class="btn btn-outline-primary" type="submit"> Add Product </button>
                </div>
            </form>
        </div>
    </div>
</div>
<%@ include file="Includes/Footer.jsp"%>
</body>
</html>

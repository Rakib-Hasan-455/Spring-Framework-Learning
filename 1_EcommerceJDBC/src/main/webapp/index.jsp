<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.ecommerce.Model.UserTable" %>
<%@ page import="com.ecommerce.Model.ProductTable" %>
<%@ page import="com.ecommerce.DAO_DataAccessObject.ProductDAO" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<% UserTable auth = (UserTable) request.getSession().getAttribute("auth");
if (auth != null) {
    request.setAttribute("auth", auth);
}

    ProductDAO productDAO = new ProductDAO();
    List<ProductTable> productsList = productDAO.showProducts();
%>

<!DOCTYPE html>
<html>
<head>

    <title>Welcome To Our Shop</title>
    <%@ include file="Includes/header.jsp"%>
</head>
<body>
<%@include file="Includes/navbar.jsp"%>
        <div class="container">
            <div class="card-header my-3"> All Products </div>
            <div class="row">

                <% if (!productsList.isEmpty()) {
                    for (ProductTable pList: productsList) { %>
                <div class="col-lg-4 my-3">
                    <div class="card border-dark mb-3" style="width: 18rem;">
                        <img class="card-img-top" src="<%= pList.getpImage() %>" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title"><%= pList.getpName() %></h5>
                            <h6 class="price"> Price : <%= pList.getpPrice()%>$ </h6>
                            <h6 class="category">Category: <%= pList.getpCategory() %></h6>
                            <div class="mt-3 d-flex justify-content-between">
                                <a href="#" class="btn btn-dark">Add to Cart</a>
                                <a href="#" class="btn btn-primary">Buy Now</a>
                            </div>
                        </div>
                    </div>
                </div>
                    <%}
                }
                %>




            </div>
        </div>
<%@ include file="Includes/Footer.jsp"%>
</body>
</html>
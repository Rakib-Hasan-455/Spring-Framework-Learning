<%@ page import="com.ecommerce.Model.UserTable" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<% UserTable auth = (UserTable) request.getSession().getAttribute("auth");
    if (auth != null) {
        request.setAttribute("auth", auth);
    }
%>
<!DOCTYPE html>
<html>
<head>

    <title>Welcome To Our Shop</title>
    <%@ include file="Includes/header.jsp"%>
</head>
<body>
<%@include file="Includes/navbar.jsp"%>

<div class="container my-3">
    <div class="d-flex py-3">
        <h3> Total Price: 166$ </h3>
        <a class="mx-3 btn btn-primary" href="#"> Check Out </a>
    </div>
    <table class="table table-light">
        <thead>
        <tr>
            <th class="text-center"> Name </th>
            <th class="text-center"> Category </th>
            <th class="text-center"> Price </th>
            <th class="text-center"> Quantity </th>
            <th class="text-center"> Remove Item </th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td class="text-center"> Xiaomi Phone </td>
            <td class="text-center"> Phone</td>
            <td class="text-center"> 188$</td>
            <td class="text-center">
                <form action="#" method="post" class="form-inline">
                    <div class="form-group d-flex justify-content-between text-center">
                        <a class="btn btn-sm btn-decre"
                           href="<%--quantity-inc-dec?action=dec&id=1&lt;%&ndash;<%=c.getId()%>&ndash;%&gt;--%>"><i
                                class="fas fa-minus-square"></i></a>

                         <input type="text" name="quantity" class="form-control" value="1<%--<%=c.getQuantity()%>--%>"
                               readonly>

                        <a class="btn bnt-sm btn-incre"
                           href="<%--quantity-inc-dec?action=inc&id=1&lt;%&ndash;<%=c.getId()%>&ndash;%&gt;--%>"><i
                                class="fas fa-plus-square"></i></a>
                        <button type="submit" class="btn btn-primary btn-sm">Buy</button>

                    </div>
                </form>
            </td>
            </td>
            <td class="text-center"><a href="remove-from-cart?id=1<%--<%=c.getId()--%> %>" class="btn btn-sm btn-danger">Remove</a></td>
        </tr>
        </tbody>
    </table>
</div>

<%@ include file="Includes/Footer.jsp"%>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: abin
  Date: 12/12/2017
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Product</title>
    <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<form action="/save" method="post">
    <label>Product name: </label><input type="text" name="productName"/>
    <label onclick="sayHello()" >Product price:</label><input type="text" name="price"/>
    <input id="btn"  type="submit" value="Add product"/>
</form>
<table>
    <thead>
       <th>id</th>
        <th>name</th>
    <th>price</th>
    </thead>
    <tbody>
    <c:forEach items="${productList}" var="product">
        <tr>
            <td>${product.productId}</td>
            <td>${product.productName}</td>
            <td>${product.price}</td>
        </tr>
    </c:forEach>
    </tbody>


</table>
<script src="js/script.js"></script>
</body>
</html>

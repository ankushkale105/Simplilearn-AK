<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Bean properties</title>
</head>
<body>
<h2>Display Bean properties</h2>
<hr>
<jsp:useBean id="productBean" class="com.ecommerce.ProductBean" scope="session"></jsp:useBean><br>
        Product Id:    <jsp:getProperty name="productBean" property="productId" />  <br><br>
        Product Name:    <jsp:getProperty name="productBean" property="productName" />  <br><br>
        Product Price:    <jsp:getProperty name="productBean" property="price" />  <br><br>

</body>
</html>

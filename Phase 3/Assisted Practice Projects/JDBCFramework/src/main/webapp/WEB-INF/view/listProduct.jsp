<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Products</title>
</head>
<body>
 <c:forEach var="product" items="${list}">   
   ${product.name}, ${product.price}, ${product.dateAdded}<br>  
 </c:forEach>  

</body>
</html>
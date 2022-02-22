<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  

<!DOCTYPE html>
<!--
Download jstl.jar from http://central.maven.org/maven2/javax/servlet/jstl/1.2/jstl-1.2.jar
-->
<html>
<head>
<meta charset="UTF-8">
<title>JSP Directives</title>
</head>
<body>
<h2>JSP Directives</h2>
<hr>
<h4>This is content from the main file.
<%@ include file="included.jsp" %></h4>

Example of using JSTL taglibs for formatting output<br>
<p>
        <h5>Currency = <fmt:formatNumber value = "1005" type = "currency"/>
<p>
<p>
        <c:set var = "now" value = "<%= new java.util.Date()%>" />
        Current date and time is <fmt:formatDate pattern = "yyyy-MM-dd hh:mm:ss" value = "${now}" /></h5>
</p>

</body>
</html>

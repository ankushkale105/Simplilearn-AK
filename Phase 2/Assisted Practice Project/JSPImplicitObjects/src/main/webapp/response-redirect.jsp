<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Header Example</title>
</head>
<body>
<h3>Response Object</h3>
<%
        String office = request.getParameter("office");
        if (office != null)
                out.println("Value of Office obtained : " + office + "<br>");
        else
                out.println("No value of Office found<br>");
%>

</body>
</html>

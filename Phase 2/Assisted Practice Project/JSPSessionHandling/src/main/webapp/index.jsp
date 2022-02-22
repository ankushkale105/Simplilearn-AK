<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Sessions</title>
</head>
<body>
<h2>Session Handling With JSP</h2>
<hr><br>
<%
  if (request.getParameter("error") != null)
          out.println("<b>Your session has expired or is invalid.</b><br>");
%>
<form action="login.jsp" method="post">
  Name :   <input name="name" id="name" maxlength=40><br><br>
  Password : <input type="password" name="pwd" id="pwd" maxlength="10"><br><br>
  <button>Submit</button>  
</form>

</body>
</html>
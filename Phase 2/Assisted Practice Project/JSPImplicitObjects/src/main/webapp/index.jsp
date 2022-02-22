<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ page errorPage = "handle-error.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Implicit Objects</title>
</head>
<body>
<h3>JSP Implicit Objects</h3><hr><br>
<%
        String responseCheck = request.getParameter("office");
        if (responseCheck != null ) {
                 response.setStatus(response.SC_MOVED_TEMPORARILY);
                 response.setHeader("Location", "response-redirect.jsp?office=" + responseCheck);
        }
        
        String errorCheck = request.getParameter("error");
        if (errorCheck != null ) {
                 int x = 0;
                 if (x == 0)
                         throw new RuntimeException("Exception has been raised");
        }
%>
<%

	   int serverPort =  request.getServerPort() ;
	   out.println(" "+"The Server is running on port : " + String.valueOf(serverPort) + "<br><br>");
	   out.println(" "+"Servlet Name is :  " + config.getServletName() + "<br><br>");
	   out.println(" "+"Server Info : " + application.getServerInfo() + "<br><br>");
   
  	   String pageName = page.toString();
 	   out.println(" "+"The name of the page is : " + pageName + "<br><br>");
   
   	   pageContext.setAttribute("userid", "Michael Jackson");
	   out.println(" "+"UserId attribute from pageContext : " + pageContext.getAttribute("userid") + "<br><br>");    
%>

	<a href="index.jsp?office=Head_Office">Show usage of response object</a><br><br>
	<a href="index.jsp?error=1">Show usage of error  object</a><br><br>

<%
   if (response.containsHeader("Office"))
            out.println(" "+"Current location is : " + response.getHeader("Office") +"<br><br>");
 %> 
</body>
</html>

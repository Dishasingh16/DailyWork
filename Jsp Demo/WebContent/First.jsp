<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to  JSP</h1>
<%
String company1=request.getParameter("company");
String company2=request.getParameter("company");
out.write("<h1>" +company1+"&nbsp;&nbsp;"+company2+"</h1>");
%>


</body>
</html>
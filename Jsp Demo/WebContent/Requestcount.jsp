<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.Date"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- -declaration tag -->
	<%!int requestCount = 0;%>

	<!---scriptlet tag-->
	<%--scriptlet contains business logic --%>
	<%
		requestCount++;
	%>

	<!-- Expression tag -->
	<h1>
		no. hits so far...<%=requestCount%></h1>
	<h1>
		todays date is
		<%=new java.util.Date()%></h1>
	<hr />
	<hr /><h1>
		todays date is
		<%=new java.util.Date()%></h1><hr /><hr />
	<h1>
		todays date is
		<%=new java.util.Date()%></h1>
		<%@include file="index.html" %>
</body>
</html>
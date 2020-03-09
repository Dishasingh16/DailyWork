<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setIntHeader("refresh", 8);
	%>
	<h1>from newfile2.jsp</h1>
	<jsp:useBean id="ref" class="com.cts.training.LoginBean"
		scope="session"></jsp:useBean>

	<jsp:getProperty property="userName" name="ref" />
	<jsp:getProperty property="password" name="ref" />

</body>
</html>
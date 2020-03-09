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
		session.setMaxInactiveInterval(5);
	%>
	<!--com.cts.training.LoginBean ref=new LoginBean()  -->
	 <jsp:useBean id="ref" class="com.cts.training.LoginBean"
		scope="session"></jsp:useBean>
	<!--ref.setUserName(request.getParameter("UserName"))  -->
	<jsp:setProperty property="userName" name="ref" />
	<jsp:setProperty property="password" name="ref" /> 
	<%-- <jsp:setProperty property="*" name="ref" /> --%>
	<jsp:forward page="NewFile.jsp"></jsp:forward> 


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="pd" uri="/WEB-INF/tlds/tagLibraryDescriptor.tld"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
+ 
</head>
<body>
	<h1>from date.jsp page</h1>
	<pd:printDate>
		<h1>inside printDate tag body</h1>
	</pd:printDate>
	<h1>outside printDate tag body</h1>
	<h2>end of page</h2>
</body>
</html>
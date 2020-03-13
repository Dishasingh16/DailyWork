<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource

user="root"
password="root"
url="jdbc:mysql://Localhost:3306/emp"
driver="com.mysql.jdbc.Driver"
/>
<%-- <sql:update>
insert into details values('kiran',6,66,676776)
</sql:update>
 --%>
<sql:query var="rs" sql="select*from details"></sql:query>
<table border="1px" width=400px>
<tr>
<th>emp_name</th>
<th>id</th>
<th>dept_id</th>
<th>salary</th>

</tr>
<c:forEach var="row" items="${rs.rows}">

<tr>
<td><c:out value="${row.emp_name }"/></td>

<td><c:out value="${row.id }"/></td>

<td><c:out value="${row.dept_id }"/></td>

<td><c:out value="${row.salary }"/></td>
</tr>

</c:forEach>
</table>
</body>
</html>
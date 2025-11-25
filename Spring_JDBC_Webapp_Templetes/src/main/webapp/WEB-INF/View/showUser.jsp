<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Student List</h2>
<table border="1">
<tr>
	<th>ID</th>
	<th>Username</th>
	<th>Password</th>
	<th>Edit</th>
	<th>Delete</th>
</tr>

<c:forEach var="u" items="${users}">
<tr>
<td>${u.id}</td> 
<td>${u.username }</td>
<td>${u.password }</td>
<td><a href="edit?id=${u.id}">Edit</a></td>
<td><a href="delete?id=${u.id}">Delete</a></td>
</tr>

</c:forEach>

</table>
${msg}
</body>
</html>
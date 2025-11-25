<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Update User Data</h2>
<form action="edituser" method="post">
	ID: <input type="hidden" name="id" value="${editdata.id}"><br>
    Username: <input type="text" name="username" value="${editdata.username}" required/><br>
    Password: <input type="password" name="password" value="${editdata.password}" required/><br>
    <input type="submit" value="Update">
    ${update}
</form>
</body>
</html>
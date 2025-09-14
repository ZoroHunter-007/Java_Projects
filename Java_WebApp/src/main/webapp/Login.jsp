<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="LoginStyle.css">
</head>
<body>
<h1>Login Form</h1>
<form action="Login.jsp" method="post">
<table>
<tr>
<td>
<input type="text" name="username" placeholder="Username" required="required"></td>

</tr>

<tr>
<td>
<input type="password" name="password" placeholder="Password" required="required"></td>

</tr>

<tr>
<td><input type="submit" name="submit" value="Submit"></td>

</tr>

<tr>
<td><p>If have no account?<a href="Home.jsp">click here</a></td>
</tr>

</table>


</form>
</body>
</html>
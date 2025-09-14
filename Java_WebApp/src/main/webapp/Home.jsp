<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>

</head>
<body>

<form action="Home.jsp" method="post">
<h1>Registration From</h1>
<table>

<tr>
<td>
Username
</td>
<td>
<input type="text" name="username" required="required">
</td>
</tr>

<tr>
<td>
Password
</td>
<td>
<input type="password" name="password" required="required">
</td>
</tr>

<tr>
<td>
Gender
</td>
<td>
Male<input type="radio" name="gender">
Female<input type="radio" name="gender">
</td>
</tr>

<tr>
<td>
Language
</td>
<td>
English<input type="checkbox" name="language">
Gujrati<input type="checkbox" name="language">
Hindi<input type="checkbox" name="language">

</td>
</tr>

<tr>
<td>
City
</td>
<td>
<select name="city">
<option value="Vadodara">Vadodara</option>
<option value="Ahmedabad">Ahmedabad</option>
<option value="Surat">Surat</option>
<option value="Rajkot">Rajkot</option>
<option value="Anand">Anand</option>
</select>

</td>
</tr>

<tr>
<td>
Date of Birth
</td>
<td>
<input type="date" name="dob">
</td>
</tr>

<tr>
<td>
File Upload
</td>
<td>
<input type="file" name="file_upload">
</td>
</tr>

<tr>
<td>
Email
</td>
<td>
<input type="email" name="email" placeholder="abc123@gmail.com">
</td>
</tr>

<tr>
<td>
<textarea rows="5" cols="20" placeholder="Please share your feedback"></textarea>
</td>
</tr>
<tr>

<td>
<br>
<input type="submit" value="Submit">&nbsp;&nbsp;&nbsp;&nbsp;
<input type="reset" value="Reset"> 
</td>
</tr>

<tr>


</tr>

</table>



</form>

</body>
</html>
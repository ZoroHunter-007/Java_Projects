<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <!-- Mobile Metas -->
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <!-- Site Metas -->
  <meta name="keywords" content="" />
  <meta name="description" content="" />
  <meta name="author" content="" />
  <link rel="shortcut icon" href="images/favicon.png" type="">

  <title> Feane </title>

  <style>
    body {
      font-family: "Segoe UI", sans-serif;
      background: #111;
      color: #fff;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
    }
    .form-container {
      background: #1a1a1a;
      padding: 40px;
      border-radius: 12px;
      width: 350px;
      box-shadow: 0 6px 18px rgba(0,0,0,0.6);
    }
    h2 {
      text-align: center;
      margin-bottom: 25px;
      font-size: 26px;
    }
    .form-group {
      margin-bottom: 18px;
    }
    label {
      display: block;
      margin-bottom: 6px;
      font-size: 14px;
      color: #bbb;
    }
    input {
      width: 100%;
      padding: 10px;
      border: none;
      border-radius: 6px;
      font-size: 14px;
      background: #222;
      color: #fff;
      background-color:yeelow;
      outline: none;
    }
    input:focus {
      border: 1px solid #f1c40f;
    }
    button {
      width: 100%;
      padding: 12px;
      background: #f1c40f;
      border: none;
      border-radius: 8px;
      font-size: 16px;
      font-weight: bold;
      cursor: pointer;
      margin-top: 10px;
    }
    button:hover {
      background: #d4ac0d;
    }
    .link {
      text-align: center;
      margin-top: 15px;
      font-size: 14px;
    }
    .link a {
      color: #f1c40f;
      text-decoration: none;
    }
    .btn {
	background-color: #ffc107;
	border: none;
	color: #000;
	padding: 10px;
	width: 100%;
	border-radius: 5px;
	font-weight: bold;
	cursor: pointer;
}
  </style>
</head>
<body>
  <div class="form-container">
    <h2>Login</h2>
    <form action="InsertPage" method="post">
      <div class="form-group">
        <label for="username">Email / Username</label>
        <input type="email" id="username" name="email" required>
      </div>
      <div class="form-group">
        <label for="password">Password</label>
        <input type="password" id="password" name="password" required>
      </div>
      <input type="submit" class="btn" value="Login" /><br><br>
     
      <div class="link">
        Don’t have an account? <a href="Register.jsp">Register</a>
      </div>
    </form>
  </div>
  
</body>
</html>

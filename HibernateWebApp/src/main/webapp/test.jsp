<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bank Dashboard</title>

<style>
    body {
        font-family: Arial, sans-serif;
        background: #eef2f3;
        margin: 0;
        padding: 0;
    }
    .container {
        width: 450px;
        margin: 80px auto;
        background: #fff;
        padding: 25px;
        border-radius: 10px;
        box-shadow: 0px 0px 15px rgba(0,0,0,0.1);
        text-align: center;
    }
    h2 {
        color: #333;
        margin-bottom: 15px;
    }
    .info-box {
        text-align: left;
        font-size: 18px;
    }
    .info-box p {
        margin: 10px 0;
        padding: 10px;
        background: #f5f7fa;
        border-radius: 5px;
        border-left: 4px solid #2e86de;
    }
    .balance {
        color: green;
        font-weight: bold;
        font-size: 22px;
    }
</style>

</head>
<body>

<div class="container">
    <h2>Welcome <%= request.getAttribute("name") %></h2>

    <div class="info-box">
        <p>Email: <%= request.getAttribute("email") %></p>
        <p>Account Number: <%= request.getAttribute("acno") %></p>
        <p>Balance: <span class="balance">₹ <%= request.getAttribute("balance") %></span></p>
    </div>
</div>

</body>
</html>

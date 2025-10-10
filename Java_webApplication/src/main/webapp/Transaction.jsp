<%@page import="java.util.ArrayList"%>
<%@page import="com.model.Account"%>
<%@page import="java.util.List"%>
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
  <link rel="shortcut icon" href="imges/bank_logo.jpg" type="">
  <title>MyBank Users</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      background: #f4f9fc;
    }

    header {
      background: linear-gradient(90deg, #0077b6, #0096c7);
      color: #fff;
      padding: 15px 30px;
      text-align: center;
      font-size: 22px;
      font-weight: bold;
    }

    .container {
      max-width: 1000px;
      margin: 30px auto;
      background: #fff;
      padding: 20px;
      border-radius: 10px;
      box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
    }

    h2 {
      text-align: center;
      margin-bottom: 20px;
      color: #333;
    }

    table {
      width: 100%;
      border-collapse: collapse;
      margin-top: 15px;
     
    }

    th, td {
      padding: 12px 15px;
      text-align: center;
    }

    th {
      background: #0077b6;
      color: white;
      font-weight: bold;
    }

    tr:nth-child(even) {
      background: #f1f9ff;
    }

    tr:hover {
      background: #e0f7fa;
    }

    td {
      border-bottom: 1px solid #ddd;
    }

    .action-links a {
      text-decoration: none;
      padding: 6px 12px;
      border-radius: 5px;
      font-size: 14px;
      font-weight: bold;
    }

    .edit {
      background: #4cafef;
      color: white;
      margin-right: 15px;
    }

    .delete {
      background: #f44336;
      color: white;
      margin-left: 15px;
    }

    .edit:hover {
      background: #2e86c1;
    }

    .delete:hover {
      background: #d32f2f;
    }
  </style>
</head>
<body>
 <header>🏦 MyBank - User Management</header>
<%ArrayList<Account>al=(ArrayList<Account>) request.getAttribute("List"); %>
<div class="container">
    <h2>Account Details</h2>
    <table  border="1">
      <thead>
        <tr>
          <th>Transaction ID</th>
          <th>Account Number</th>
          <th>Account Holder Name</th>
          <th>Transaction Type</th>
          <th>Balance</th>
          <th>Amount</th>
          <th>Transaction Date</th>
         
        </tr>
      </thead>

<% for(Account a:al){
%>

	<tr>
	<td><%=a.getT_id() %></td>
	<td><%=a.getAc_number() %></td>
	<td><%=a.getHolder_name() %></td>
	<td><%=a.getT_type() %></td>
	<td><%=a.getBalance() %></td>
	<td><%=a.getAmount() %></td>
	<td><%=a.getDate() %></td>
	
	</tr>
<% 
}

%>
</table>
</div>
</body>
</html>
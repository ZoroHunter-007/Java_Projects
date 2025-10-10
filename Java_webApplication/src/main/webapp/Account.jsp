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
      margin-right: 5px;
    }

    .delete {
      background: #f44336;
      color: white;
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
<% List<Account> list=(List<Account>)request.getAttribute("List"); %>
<div class="container">
    <h2>Account Details</h2>
    <table>
      <thead>
        <tr>
          <th>ID</th>
          <th>Account Number</th>
          <th>Account Holder Name</th>
          <th>Account Type</th>
          <th>Balance</th>
          <th>Actions</th>
        </tr>
      </thead>
<%
for(Account a:list){
%>

	<tr>
	<td><%=a.getAc_id() %></td>
	<td><%=a.getAc_number() %></td>
	<td><%=a.getHolder_name() %></td>
	<td><%=a.getAc_type() %></td>
	<td><%=a.getBalance() %></td>
	<td class="action-links">
            <a href="InsertData?action=edit&id=<%=a.getAc_id()%>" class="edit">Edit</a>
            <a href="InsertData?action=delete&id=<%=a.getAc_id()%>" class="delete">Delete</a>
          </td>
	</tr>
<%	
}
%>
</table>
</div>
</body>
</html>
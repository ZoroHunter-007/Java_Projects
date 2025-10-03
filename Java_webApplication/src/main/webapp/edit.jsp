<%@page import="com.model.user_reg"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Edit Record</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f8f9fa; /* Light gray background like MyBank */
      display: flex;
      justify-content: center;
      align-items: center;
      min-height: 100vh;
      margin: 0;
    }
    .edit-card {
      background: #fff;
      border-radius: 12px;
      padding: 30px;
      box-shadow: 0px 4px 15px rgba(0,0,0,0.1); /* Soft shadow like MyBank cards */
      width: 100%;
      max-width: 500px;
    }
    .edit-title {
      font-weight: bold;
      color: #0077b6; /* MyBank Blue */
      margin-bottom: 25px;
      text-align: center;
      font-size: 28px;
    }
    .form-label {
      font-weight: bold;
      color: #333;
    }
    /* Style consistency for form focus */
    .form-control:focus {
      border-color: #0077b6;
      box-shadow: 0 0 5px rgba(0,119,182,0.5);
    }
    /* Style consistency for the primary button */
    .btn-primary {
      background-color: #0077b6; 
      border-color: #0077b6;
      transition: background-color 0.3s ease;
    }
    .btn-primary:hover {
      background-color: #005a8f;
      border-color: #005a8f;
    }
  </style>
</head>
<body>

<%
    // Get the data object from request
    user_reg data = (user_reg) request.getAttribute("edit");
%>

  <div class="edit-card">
    <h2 class="edit-title">Edit Record</h2>
    <form action="InsertData" method="post">
      
      <input type="hidden" name="id" value="<%=data.getId() %>">
      
      <div class="mb-3">
        <label for="userName" class="form-label">User Name</label>
        <div class="input-group">
          <span class="input-group-text"><i class="fa fa-user"></i></span>
          <input type="text" class="form-control" id="userName" value="<%= data.getUsername()%>" name="username" required>
        </div>
      </div>
      
      <div class="mb-3">
        <label for="userEmail" class="form-label">Email</label>
        <div class="input-group">
          <span class="input-group-text"><i class="fa fa-envelope"></i></span>
          <input type="email" class="form-control" id="userEmail" value="<%= data.getEmail() %>" name="email" required>
        </div>
      </div>
      
      <div class="mb-3">
        <label for="userPhone" class="form-label">Phone</label>
        <div class="input-group">
          <span class="input-group-text"><i class="fa fa-phone"></i></span>
          <input type="text" class="form-control" id="userPhone" value="<%= data.getPhone() %>" name="phone" required>
        </div>
      </div>
      
      <div class="mb-4">
        <label for="userPassword" class="form-label">Password</label>
        <div class="input-group">
          <span class="input-group-text"><i class="fa fa-lock"></i></span>
          <input type="password" class="form-control" id="userPassword" placeholder="Enter new password" name="password">
        </div>
        <small class="form-text text-muted">Leave blank to keep the existing password.</small>
      </div>
      
     
      
      <div class="d-grid">
        <button type="submit" class="btn btn-primary btn-lg">Update Record</button>
      </div>
    </form>
  </div>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
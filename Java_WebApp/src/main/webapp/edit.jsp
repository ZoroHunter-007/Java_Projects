<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.model.User_reg"%>
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
    /* ------------------------------------- */
    /* GLOBAL STYLES (Based on Dashboard Theme) */
    /* ------------------------------------- */
    body {
        font-family: "Segoe UI", sans-serif;
        background: #f8f9fa; /* Light background for the main content area */
        display: flex;
      justify-content: center;
      align-items: center;
      min-height: 100vh;
      margin: 0;
    }
    
    /* ------------------------------------- */
    /* SIDEBAR (Dark Theme from Dashboard Image) */
    /* ------------------------------------- */
    .sidebar {
        width: 250px;
        background: #343a40; /* Dark gray */
        color: #fff;
        height: 100vh;
        padding: 20px 0;
        box-shadow: 2px 0 5px rgba(0,0,0,0.1);
        position: fixed;
    }
    .sidebar a {
        padding: 10px 20px;
        text-decoration: none;
        font-size: 16px;
        color: #bbb;
        display: block;
    }
    .sidebar a:hover {
        background-color: #495057; /* Slightly lighter on hover */
        color: #fff;
    }
    .sidebar h2 {
        color: #fff;
        padding: 0 20px 10px;
        margin-top: 0;
        font-size: 20px;
    }

    /* ------------------------------------- */
    /* HEADER (Orange Theme from Dashboard Image) */
    /* ------------------------------------- */
    .header {
        background: #ffc107; /* Bright Orange */
        color: #343a40;
        padding: 15px 20px;
        font-size: 24px;
        font-weight: bold;
        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        margin-left: 250px; /* Offset for sidebar */
    }
    
    /* ------------------------------------- */
    /* MAIN CONTENT AREA (Light Background) */
    /* ------------------------------------- */
    .main-content {
        margin-left: 250px; /* Offset for sidebar */
        padding: 40px;
        width: 100%;
        box-sizing: border-box;
    }

    /* ------------------------------------- */
    /* FORM STYLES (Adapted to Main Content Area) */
    /* ------------------------------------- */
    .form-container {
        /* Use a light background for the container itself, like the dashboard cards */
        background: #fff; 
        padding: 30px;
        border-radius: 8px;
        width: 100%; /* Adjust width to fill content */
        max-width: 450px;
        box-shadow: 0 2px 10px rgba(0,0,0,0.1);
    }
    .form-container h2 {
        text-align: center;
        color: #343a40; /* Dark text on light background */
        margin-bottom: 25px;
        font-size: 22px;
    }
    .form-group {
        margin-bottom: 15px;
    }
    label {
        display: block;
        margin-bottom: 5px;
        font-size: 14px;
        color: #555;
    }
    input[type="text"], input[type="email"], input[type="password"] {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
        font-size: 14px;
        background: #fff;
        color: #333;
        outline: none;
    }
    input:focus {
        border-color: #ffc107; /* Orange accent on focus */
        box-shadow: 0 0 5px rgba(255, 193, 7, 0.5);
    }
     .btn {
        background-color: #ffc107; /* Orange button */
        border: none;
        color: #000;
        padding: 10px;
        width: 100%;
        border-radius: 4px;
        font-weight: bold;
        cursor: pointer;
        margin-top: 15px;
        transition: background-color 0.3s;
    }
    .btn:hover {
        background: #d4ac0d; /* Darker orange on hover */
    }
    .center-image {
  display: flex;
  justify-content: center;
  align-items: center;
  margin-top: 10px;
}
.center-image img {
  max-width: 220px; /* optional: controls image size */
  border-radius: 8px; /* optional: rounded corners */
}
</style>
</head>
<body>
<% 
List<User_reg>list=(List<User_reg>) request.getAttribute("list");

if(list==null){
	list=new ArrayList<>();
	
}
User_reg u=(User_reg)request.getAttribute("edit"); %>
  <%-- This page assumes a User_reg object named 'u' has been set 
     in the request scope by the preceding Servlet. --%>

<div class="form-container" style="align-items: center;">
    <h2>Update Account</h2>
    
    <form action="Modfied" method="post" enctype="multipart/form-data">
        <div class="center-image">
        
        <% if (u != null && u.getId() > 0) { %>
        <img src="ShowData?id=<%= u.getId() %>" 
             alt="User Image">
    <% } else { %>
        <img src="images/default-avatar.png" 
             alt="Default Image" 
             style="width: 120px; height: 120px; border-radius: 50%; border: 2px solid #ddd;">
    <% } %>
    </div>
    <div class="form-group">
            <label for="id">ID</label>
            <input type="hidden" id="ID" name="id" required value="<%= u.getId() %>" />
            
            <input type="text" value="<%= u.getId() %>" disabled />
        </div>
        
        <div class="form-group">
            <label for="fullname">Full Name</label>
            <input type="text" id="fullname" name="fullname" required value="<%= u.getFullname() %>" />
        </div>
        
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" id="email" name="email" required value="<%= u.getEmail() %>" />
        </div>
        
        <div class="form-group">
            <label for="username">Username</label>
            <input type="text" id="username" name="reg_username" required value="<%= u.getUsername() %>" />
        </div>
        
        
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="reg_password" placeholder="Enter new password to change" />
        </div>
         <div class="form-group">
            <label for="Upload Image">Upload Image</label>
            <input type="file" id="username" name="Userimage" value="<%= u.getImage() %>"  required/>
        </div>
        
        <input type="submit" class="btn" value="Update" />
        
    </form>
</div>
</body>
</html>
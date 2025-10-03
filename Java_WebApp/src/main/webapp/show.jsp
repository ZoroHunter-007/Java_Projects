<%@page import="com.model.User_reg"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List - Burger Admin</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: #fff8f0;
        margin: 0;
        padding: 20px;
    }

    h2 {
        text-align: center;
        color: #e85a4f;
        margin-bottom: 20px;
    }

    table {
        width: 90%;
        margin: auto;
        border-collapse: collapse;
        background: #fff;
        box-shadow: 0 6px 15px rgba(0,0,0,0.1);
        border-radius: 12px;
        overflow: hidden;
    }

    th {
        background: #ffb347; /* burger orange */
        color: white;
        padding: 12px;
        text-transform: uppercase;
        letter-spacing: 1px;
        font-size: 14px;
    }

    td {
        padding: 12px;
        text-align: center;
        border-bottom: 1px solid #eee;
    }

    tr:nth-child(even) {
        background: #fff4e6;
    }

    tr:hover {
        background: #ffe0b3;
    }

    a {
        text-decoration: none;
        color: white;
        padding: 6px 12px;
        border-radius: 6px;
        font-size: 13px;
    }

    a.edit {
        background: #ff6f61; /* burger red */
    }

    a.edit:hover {
        background: #e85a4f;
    }

    a.delete {
        background: #333;
    }

    a.delete:hover {
        background: #000;
    }
</style>
</head>
<body>
    <h2>🍔 User Management - Burger Admin Panel</h2>

    <%
    List<User_reg> list = (List<User_reg>) request.getAttribute("List");
    %>

    <table>
        <tr>
            <th>ID</th>
            <th>Full Name</th>
            <th>Email</th>
            <th>Username</th>
            <th>Password</th>
            <th>Image</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>

        <%
        for(User_reg u : list){ 
        %>
        <tr>
            <td><%=u.getId() %></td>
            <td><%=u.getFullname() %></td>
            <td><%=u.getEmail() %></td>
            <td><%=u.getUsername() %></td>
            <td><%=u.getPassword() %></td>
            <td>
            <img src="getImage?id=<%=u.getId() %>" alt="User Image" width="70" height="70">
            </td>
            <td><a href="Modfied?action=edit&id=<%=u.getId()%>" class="edit">Edit</a></td>
            <td><a href="Modfied?action=delete&id=<%=u.getId()%>" class="delete">Delete</a></td>
        </tr>
        <%
        }
        %>
    </table>
</body>
</html>


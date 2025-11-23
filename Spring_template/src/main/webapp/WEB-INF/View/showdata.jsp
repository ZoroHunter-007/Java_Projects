<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
    body {
        font-family: "Poppins", sans-serif;
        background: #f0f2f7;
        padding: 40px;
    }

    .table-container {
        width: 80%;
        margin: auto;
        background: #fff;
        padding: 20px;
        border-radius: 12px;
        box-shadow: 0 8px 25px rgba(0,0,0,0.12);
    }

    h2 {
        text-align: center;
        color: #333;
        margin-bottom: 20px;
        font-weight: 600;
    }

    table {
        width: 100%;
        border-collapse: collapse;
        overflow: hidden;
        border-radius: 10px;
    }

    thead {
        background: linear-gradient(135deg, #6a11cb, #2575fc);
        color: white;
        text-align: left;
    }

    th, td {
        padding: 12px 15px;
    }

    th {
        font-size: 15px;
        text-transform: uppercase;
        letter-spacing: 0.5px;
    }

    tr:nth-child(even) {
        background: #f3f6fb;
    }

    tr:hover {
        background: #e4e9f7;
        transition: background 0.3s;
    }

    td {
        font-size: 14px;
        color: #333;
    }

</style>
</head>
<body>

<div class="table-container">
    <h2>Student Records</h2>
    <table>
        <thead>
            <tr>
                <th>Student ID</th>
                <th>Name</th>
                <th>Password</th>
            </tr>
        </thead>
        <tbody>
     <c:forEach var="std" items="${stud}">
     <tr>
     <td>${std.stud_id}</td>
     <td>${std.stud_name}</td>
     <td>${std.stud_pass}</td>
     
     </tr>
     
     
     </c:forEach> 
     </tbody>  
    </table>
</div>

</body>
</html>

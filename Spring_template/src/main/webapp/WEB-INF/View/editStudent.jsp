<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Student Registration</title>
    <style>
        body {
            font-family: 'Poppins', sans-serif;
            background: linear-gradient(135deg, #6a11cb, #2575fc);
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background: #ffffff;
            padding: 30px;
            width: 420px;
            border-radius: 15px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.15);
            animation: fadeIn 0.7s ease-in-out;
        }
        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(20px); }
            to { opacity: 1; transform: translateY(0); }
        }
        h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #333;
            font-weight: 600;
        }
        label {
            font-weight: 500;
            display: block;
            margin-bottom: 6px;
            color: #444;
        }
        input {
            width: 100%;
            padding: 10px;
            margin-bottom: 18px;
            border: 1px solid #bbb;
            border-radius: 8px;
            outline: none;
            transition: 0.3s;
            background: #f7f7f7;
        }
        input:focus {
            border-color: #6a11cb;
            box-shadow: 0 0 8px rgba(106,17,203,0.4);
            background: #fff;
        }
        .btn {
            width: 100%;
            padding: 12px;
            background: #6a11cb;
            color: white;
            border: none;
            border-radius: 8px;
            font-size: 17px;
            cursor: pointer;
            font-weight: 600;
            transition: 0.3s;
        }
        .btn:hover {
            background: #580fa7;
        }
        button:hover {
            background: #580fa7;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Student Update Data</h2>
        <form action="editData" method="post">
        <input type="hidden" id="id" name="stud_id"  value="${stud.stud_id}" />
            <label for="name">Full Name</label>
            <input type="text" id="name" name="stud_name" value="${stud.stud_name}" placeholder="Enter your full name"  />

            <label for="password">Password</label>
            <input type="password" id="password" name="stud_pass" value="${stud.stud_pass}" placeholder="Enter your password"  />

            <input type="submit" value="Update" class="btn" />
           
        </form>
    </div>
</body>
</html>

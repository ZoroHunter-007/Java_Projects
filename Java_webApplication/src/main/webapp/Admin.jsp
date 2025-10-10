<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
<title>MyBank - Admin Dashboard</title>
<style>
    /* ====== GLOBAL ====== */
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
        font-family: "Poppins", sans-serif;
    }
    body {
        background-color: #f4f8fb;
        display: flex;
    }

    /* ====== SIDEBAR ====== */
    .sidebar {
        width: 240px;
        background-color: #0288d1;
        color: #fff;
        height: 100vh;
        position: fixed;
        top: 0;
        left: 0;
        display: flex;
        flex-direction: column;
        justify-content: space-between;
        box-shadow: 3px 0 10px rgba(0,0,0,0.1);
    }
    .sidebar h2 {
        text-align: center;
        padding: 20px 0;
        font-size: 22px;
        border-bottom: 1px solid rgba(255,255,255,0.3);
    }
    .nav-links {
        list-style: none;
        padding: 20px;
    }
    .nav-links li {
        margin: 20px 0;
    }
    .nav-links a {
        color: white;
        text-decoration: none;
        font-size: 16px;
        display: flex;
        align-items: center;
        padding: 10px 15px;
        border-radius: 8px;
        transition: background-color 0.3s ease;
    }
    .nav-links a:hover {
        background-color: #0277bd;
    }
    .nav-links i {
        margin-right: 10px;
    }

    /* ====== MAIN CONTENT ====== */
    .main-content {
        margin-left: 240px;
        width: calc(100% - 240px);
        padding: 20px 40px;
    }

    /* ====== TOP BAR ====== */
    .topbar {
        background: #fff;
        padding: 15px 25px;
        border-radius: 12px;
        box-shadow: 0 2px 10px rgba(0,0,0,0.05);
        display: flex;
        justify-content: space-between;
        align-items: center;
        margin-bottom: 30px;
    }
    .topbar h1 {
        font-size: 24px;
        color: #0288d1;
    }
    .topbar .admin-info {
        display: flex;
        align-items: center;
        gap: 10px;
        font-weight: 500;
    }
    .admin-info img {
        width: 70px;
        height: 70px;
        border-radius: 50%;
        border: 2px solid #0288d1;
    }

    /* ====== DASHBOARD CARDS ====== */
    .dashboard {
        display: grid;
        grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
        gap: 25px;
    }
    .card {
        background: white;
        border-radius: 15px;
        padding: 25px;
        box-shadow: 0 4px 10px rgba(0,0,0,0.1);
        transition: transform 0.3s ease, box-shadow 0.3s ease;
        position: relative;
        overflow: hidden;
    }
    .card:hover {
        transform: translateY(-5px);
        box-shadow: 0 6px 15px rgba(0,0,0,0.15);
    }
    .card h3 {
        color: #0288d1;
        margin-bottom: 10px;
    }
    .card p {
        color: #555;
        font-size: 15px;
    }
    .card i {
        position: absolute;
        top: 20px;
        right: 20px;
        font-size: 30px;
        color: #0288d1;
        opacity: 0.3;
    }

    /* ====== LOGOUT ====== */
    .logout {
        padding: 20px;
        text-align: center;
        border-top: 1px solid rgba(255,255,255,0.3);
    }
    .logout a {
        color: white;
        text-decoration: none;
        font-weight: 500;
        background-color: #0277bd;
        padding: 10px 20px;
        border-radius: 8px;
        transition: background 0.3s;
    }
    .logout a:hover {
        background-color: #015d8a;
    }
</style>
<!-- Icon library -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
</head>
<body>

    <!-- ===== SIDEBAR ===== -->
    <div class="sidebar">
        <h2>🏦 MyBank Admin</h2>
        <ul class="nav-links">
            <li><a href="#"><i class="fa fa-tachometer-alt"></i> Dashboard</a></li>
            <li><a href="ShowData"><i class="fa fa-users"></i> User Management</a></li>
            <li><a href="ShowAccount"><i class="fa fa-university"></i> Accounts</a></li>
            <li><a href="ShowTransaction"><i class="fa fa-exchange-alt"></i> Transactions</a></li>
            <li><a href="#"><i class="fa fa-chart-line"></i> Reports</a></li>
            <li><a href="#"><i class="fa fa-cog"></i> Settings</a></li>
        </ul>
        <div class="logout">
            <a href="LogoutServlet">Logout</a>
        </div>
    </div>

    <!-- ===== MAIN CONTENT ===== -->
    <div class="main-content">
        <div class="topbar">
            <h1>Welcome, Admin</h1>
            <div class="admin-info">
                <span>Admin</span>
                <img src="imges/Dhruv.jpg" alt="Admin Avatar">
            </div>
        </div>

        <div class="dashboard">
            <div class="card">
                <i class="fa fa-users"></i>
                <h3>Registered Users</h3>
                <p>Manage all customer profiles and accounts.</p>
                <a href="ShowData" style="text-decoration:none; color:#0288d1; font-weight:500;">View Users</a>
            </div>
            <div class="card">
                <i class="fa fa-credit-card"></i>
                <h3>Active Accounts</h3>
                <p>View savings and current account information.</p>
                <a href="ShowAccount" style="text-decoration:none; color:#0288d1; font-weight:500;">View Accounts</a>
            </div>
            <div class="card">
                <i class="fa fa-money-bill-wave"></i>
                <h3>Recent Transactions</h3>
                <p>Track deposits, withdrawals, and transfers.</p>
                <a href="ShowTransaction" style="text-decoration:none; color:#0288d1; font-weight:500;">View Transactions</a>
            </div>
            <div class="card">
                <i class="fa fa-file-invoice"></i>
                <h3>Generate Reports</h3>
                <p>Download activity and transaction reports.</p>
                <a href="#" style="text-decoration:none; color:#0288d1; font-weight:500;">Generate Now</a>
            </div>
        </div>
    </div>
    
        
</body>
</html>

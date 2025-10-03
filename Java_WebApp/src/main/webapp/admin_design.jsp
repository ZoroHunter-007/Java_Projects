<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Burger Admin Panel</title>
  <style>
    body {
      margin: 0;
      font-family: Arial, sans-serif;
      background: #f8f4ec;
      color: #333;
    }

    header {
      background: #ffb347; /* burger orange */
      color: white;
      padding: 15px;
      text-align: center;
      font-size: 24px;
      font-weight: bold;
    }

    .sidebar {
      width: 220px;
      background: #333;
      color: white;
      height: 100vh;
      position: fixed;
      top: 0;
      left: 0;
      padding-top: 60px;
    }

    .sidebar a {
      display: block;
      color: white;
      padding: 12px 20px;
      text-decoration: none;
      transition: 0.3s;
    }

    .sidebar a:hover {
      background: #ffb347;
      color: black;
    }

    .main-content {
      margin-left: 220px;
      padding: 20px;
    }

    .dashboard {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
      gap: 20px;
    }

    .card {
      background: white;
      padding: 20px;
      border-radius: 12px;
      box-shadow: 0 4px 10px rgba(0,0,0,0.1);
      text-align: center;
    }

    .card h3 {
      margin-bottom: 10px;
      color: #ff6f61;
    }

    .btn {
      display: inline-block;
      padding: 10px 15px;
      background: #ff6f61;
      color: white;
      border-radius: 8px;
      text-decoration: none;
      margin-top: 10px;
      transition: 0.3s;
    }

    .btn:hover {
      background: #e85a4f;
    }
  </style>
</head>
<body>

  <header>
    🍔 Burger Admin Panel
  </header>

  <div class="sidebar">
    <a href="#">Dashboard</a>
    <a href="add_item.jsp">Manage Menu</a>
    <a href="#">Orders</a>
    <a href="ShowData">Customers</a>
    
  </div>

  <div class="main-content">
    <h2>Welcome, Admin!</h2>
    <p>Here’s an overview of your Burger Website:</p>

    <div class="dashboard">
      <div class="card">
        <h3>🍔 Menu Items</h3>
        <p>12 Active</p>
        <a href="#" class="btn">Manage</a>
      </div>
      <div class="card">
        <h3>🛒 Orders</h3>
        <p>45 Today</p>
        <a href="#" class="btn">View</a>
      </div>
      <div class="card">
        <h3>👥 Customers</h3>
        <p>230 Registered</p>
        <a href="#" class="btn">Check</a>
      </div>
      <div class="card">
        <h3>📊 Reports</h3>
        
        <p>Weekly Sales: ₹12,500</p>
        <a href="#" class="btn">View</a>
      </div>
    </div>
  </div>

</body>
</html>


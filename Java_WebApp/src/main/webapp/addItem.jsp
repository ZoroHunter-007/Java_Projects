<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
     <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <!-- Site Metas -->
  <meta name="keywords" content="" />
  <meta name="description" content="" />
  <meta name="author" content="" />
  <link rel="shortcut icon" href="images/favicon.png" type="">

  <title> Add Item</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
      <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css" />
  <!-- nice select  -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/css/nice-select.min.css" integrity="sha512-CruCP+TD3yXzlvvijET8wV5WxxEh5H8P4cmz0RFbKK6FlZ2sYl3AEsKlLPHbniXKSrDdFewhbmBK5skbdsASbQ==" crossorigin="anonymous" />
  <!-- font awesome style -->
  <link href="css/font-awesome.min.css" rel="stylesheet" />

  <!-- Custom styles for this template -->
  <link href="css/style.css" rel="stylesheet" />
  <!-- responsive style -->
  <link href="css/responsive.css" rel="stylesheet" />
  <style>
    /* ==== Global Styles ==== */
    body {
      font-family: 'Poppins', sans-serif;
      background: #fafafa;
      margin: 0;
      padding: 0;
      color: #333;
    }

    h2 {
      text-align: center;
      font-size: 28px;
      margin-top: 40px;
      font-weight: 600;
      color: #222;
      letter-spacing: 1px;
    }

    .form-container {
      max-width: 650px;
      margin: 40px auto;
      background: #fff;
      border-radius: 20px;
      padding: 35px 40px;
      box-shadow: 0 8px 30px rgba(0, 0, 0, 0.1);
    }

    label {
      display: block;
      margin-bottom: 6px;
      font-weight: 500;
      font-size: 15px;
      color: #444;
    }

    input[type="text"],
    input[type="number"],
    input[type="file"],
    textarea,
    select {
      width: 100%;
      padding: 12px;
      margin-bottom: 20px;
      border: 1px solid #ddd;
      border-radius: 10px;
      font-size: 15px;
      transition: border-color 0.3s;
      outline: none;
    }

    input:focus, textarea:focus, select:focus {
      border-color: #ffcc00;
      box-shadow: 0 0 5px rgba(255, 204, 0, 0.4);
    }

    textarea {
      resize: none;
    }

    input[type="file"] {
      background-color: #f9f9f9;
      cursor: pointer;
    }

    /* ==== Button Styles ==== */
    input[type="button"],
    input[type="submit"],
    input[type="reset"] {
      width: 100%;
      background: #ffcc00;
      color: #000;
      font-size: 16px;
      font-weight: 600;
      padding: 12px;
      border: none;
      border-radius: 10px;
      cursor: pointer;
      transition: all 0.3s ease;
      box-shadow: 0 4px 10px rgba(255, 204, 0, 0.3);
    }

    input[type="button"]:hover,
    input[type="submit"]:hover,
    input[type="reset"]:hover {
      background: #ffb300;
      transform: scale(1.03);
      box-shadow: 0 6px 15px rgba(255, 179, 0, 0.4);
    }

    input[type="button"]:active {
      transform: scale(0.98);
      background: #e6a800;
    }

    /* ==== Icon Header ==== */
    .form-header {
      text-align: center;
      margin-bottom: 20px;
    }

    .form-header img {
      width: 70px;
      margin-bottom: 10px;
    }

    /* ==== Responsive ==== */
    @media (max-width: 600px) {
      .form-container {
        padding: 25px;
      }
      h2 {
        font-size: 24px;
      }
    }
  </style>
</head>
<body>

  <h2>🍔 Add New Menu Item</h2>

  <div class="form-container">
    <div class="form-header">
      <img src="https://cdn-icons-png.flaticon.com/512/3595/3595455.png" alt="Food Icon">
    </div>

    <form action="AddItemServlet" method="post" enctype="multipart/form-data">

      <label for="name">Item Name</label>
      <input type="text" id="name" name="itemName" placeholder="e.g., Cheese Burger" required>

      <label for="description">Description</label>
      <textarea id="description" name="itemDescription" rows="3" placeholder="Write item details..." required></textarea>

      <label for="price">Price (₹)</label>
      <input type="number" id="price" name="itemPrice" placeholder="e.g., 120" required>

      <label for="category">Category</label>
      <select id="category" name="itemCategory" required>
        <option value="Burger">Burger</option>
        <option value="Pizza">Pizza</option>
        <option value="Pasta">Pasta</option>
        <option value="Fries">Fries</option>
        <option value="Drinks">Drinks</option>
      </select>

      <label for="image">Upload Image</label>
      <input type="file" id="image" name="itemImage"  required>

      <input type="submit" value="➕ Add Item">
      <!-- Example of a reset or cancel button -->
      <!-- <input type="reset" value="Clear Form"> -->
    </form>
  </div>

</body>
</html>

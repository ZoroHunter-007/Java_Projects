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

  <title> Feane </title>
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
        body {
            background-color: #1a1a1a;
            color: #fff;
            font-family: Arial, sans-serif;
            padding: 20px;
        }

        .checkout-container {
            max-width: 600px;
            margin: auto;
            background-color: #2c2c2c;
            padding: 20px;
            border-radius: 10px;
        }

        .checkout-item {
            display: flex;
            justify-content: space-between;
            padding: 10px 0;
            border-bottom: 1px solid #444;
        }

        input[type="submit"] {
            background-color: #f8b739;
            color: #000;
            padding: 15px;
            border: none;
            border-radius: 10px;
            cursor: pointer;
            width: 100%;
            font-size: 1.1em;
        }
    </style>
</head>

<body>

<header class="header_section">
      <div class="container">
        <nav class="navbar navbar-expand-lg custom_nav-container ">
          <a class="navbar-brand" href="Burger_home.jsp">
            <span>
              Feane
            </span>
          </a>

          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class=""> </span>
          </button>

          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav  mx-auto ">
              <li class="nav-item ">
                <a class="nav-link" href="Burger_home.jsp">Home <span class="sr-only">(current)</span></a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="menu.jsp">Menu</a>
              </li>
              <li class="nav-item active">
                <a class="nav-link" href="about.jsp">About  </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="book.jsp">Book Table</a>
              </li>
            </ul>
            <div class="user_option">
              <a href="Login_burger.jsp" class="user_link">
                <i class="fa fa-user" aria-hidden="true"></i>
              </a>
              <a class="cart_link" href="AddToCart.jsp">
                <svg version="1.1" id="Capa_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 456.029 456.029" style="enable-background:new 0 0 456.029 456.029;" xml:space="preserve">
                  <g>
                    <g>
                      <path d="M345.6,338.862c-29.184,0-53.248,23.552-53.248,53.248c0,29.184,23.552,53.248,53.248,53.248
                   c29.184,0,53.248-23.552,53.248-53.248C398.336,362.926,374.784,338.862,345.6,338.862z" />
                    </g>
                  </g>
                  <g>
                    <g>
                      <path d="M439.296,84.91c-1.024,0-2.56-0.512-4.096-0.512H112.64l-5.12-34.304C104.448,27.566,84.992,10.67,61.952,10.67H20.48
                   C9.216,10.67,0,19.886,0,31.15c0,11.264,9.216,20.48,20.48,20.48h41.472c2.56,0,4.608,2.048,5.12,4.608l31.744,216.064
                   c4.096,27.136,27.648,47.616,55.296,47.616h212.992c26.624,0,49.664-18.944,55.296-45.056l33.28-166.4
                   C457.728,97.71,450.56,86.958,439.296,84.91z" />
                    </g>
                  </g>
                  <g>
                    <g>
                      <path d="M215.04,389.55c-1.024-28.16-24.576-50.688-52.736-50.688c-29.696,1.536-52.224,26.112-51.2,55.296
                   c1.024,28.16,24.064,50.688,52.224,50.688h1.024C193.536,443.31,216.576,418.734,215.04,389.55z" />
                    </g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                  <g>
                  </g>
                </svg>
              </a>
              
              <a href="" class="order_online">
                Order Online
              </a>
            </div>
          </div>
        </nav>
      </div>
    </header>
    <div class="checkout-container">
        <h1>Checkout</h1>

        <form  method="post" id="checkoutForm">

            <div id="cartItems"></div>

            <input type="hidden" name="cartData" id="cartData">

            <a href="PlaceOrder.jsp" class="checkout-btn" style="display:block; margin-top:20px; background-color:#f8b739; color:#000; text-align:center; padding:15px; border-radius:10px; text-decoration:none;">Place Order</a>
        </form>
    </div>

    <script>
  
    window.onload = function () {
        const cart = JSON.parse(localStorage.getItem('cart')) || [];
        const cartItemsDiv = document.getElementById('cartItems');

        if (cart.length === 0) {
            cartItemsDiv.innerHTML = "<p>Your cart is empty.</p>";
            document.querySelector('input[type="submit"]').disabled = true;
        } else {
            let totalPrice = 0;
            let cartString = "";

            cart.forEach(item => {
                totalPrice += item.price;

                const itemDiv = document.createElement('div');
                itemDiv.className = 'checkout-item';
                itemDiv.innerHTML = `
                    <span>${item.name}</span>
                    <span>$${item.price}</span>
                `;
                cartItemsDiv.appendChild(itemDiv);

                // Create simple string format: name|price|image separated by commas
                cartString += `${item.name}|${item.price}|${item.image},`;
            });

            const totalDiv = document.createElement('div');
            totalDiv.className = 'checkout-item';
            totalDiv.innerHTML = `<strong>Total</strong><strong>$${totalPrice}</strong>`;
            cartItemsDiv.appendChild(totalDiv);

            document.getElementById('cartData').value = cartString.slice(0, -1); // Remove last comma
        }
    };
</script>

 

</body>

</html>

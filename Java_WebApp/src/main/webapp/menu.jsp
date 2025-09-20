<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <!-- Basic -->
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <!-- Mobile Metas -->
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
  <!-- Site Metas -->
  <meta name="keywords" content="" />
  <meta name="description" content="" />
  <meta name="author" content="" />
  <link rel="shortcut icon" href="images/favicon.png" type="">

  <title> Feane </title>

  <!-- bootstrap core css -->
  <link rel="stylesheet" type="text/css" href="css/bootstrap.css" />

  <!--owl slider stylesheet -->
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
    /* Reset */
   

   

    h1 {
      text-align: center;
      font-size: 2.5rem;
      margin-bottom: 40px;
      color: #222;
    }
.menu-container {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;   /* Center the cards */
  gap: 50px;                 /* Space between cards */
  padding: 20px;             /* Space inside container */
}

.menu-card {
  background: #fff;
  border-radius: 16px;
  box-shadow: 0 6px 15px rgba(0,0,0,0.1);
  overflow: hidden;
  transition: transform 0.3s ease, box-shadow 0.3s ease;
  display: flex;
  flex-direction: column;
  height: 400px;             /* Keep same height */
  flex: 1 1 250px;           /* Responsive card sizing */
           /* Prevent cards from stretching too wide */
}

.menu-card:hover {
  transform: translateY(-5px);
  box-shadow: 0 10px 20px rgba(0,0,0,0.15);
}


     .menu-card img {
      width: 70%;
      height: 180px;
   	margin:auto;
      
    }

    .card-content {
      flex: 1;
      display: flex;
      flex-direction: column;
      justify-content: space-between;
      padding: 15px;
    }

    .card-content h3 {
      font-size: 20px;
      margin-bottom: 8px;
      color: #111;
    }

    .card-content p {
      font-size: 14px;
      color: #555;
      flex-grow: 1;
    }

    .price {
      font-weight: bold;
      color: #ff5722;
      font-size: 16px;
      margin: 10px 0;
    }

    .menu-card button {
      background: #ff5722;
      color: #fff;
      border: none;
      padding: 10px;
      border-radius: 8px;
      cursor: pointer;
      transition: background 0.3s;
      font-size: 14px;
      font-weight: 600;
    }
     .btn {
	background-color: #ff5722;
	border: none;
	color: #fff;
	padding: 10px;
	width: 100%;
	border-radius: 5px;
	font-weight: bold;
	cursor: pointer;
	font-size: 14px;
}
.menu-card.btn:hover {
      background: #e64a19;
    }

    .menu-card button:hover {
      background: #e64a19;
    }
  </style>

</head>

<body class="sub_page">

  <div class="hero_area">
    <div class="bg-box">
      <img src="images/hero-bg.jpg" alt="">
    </div>
    <!-- header section strats -->
    <header class="header_section">
      <div class="container">
        <nav class="navbar navbar-expand-lg custom_nav-container ">
          <a class="navbar-brand" href="index.html">
            <span>
              Feane
            </span>
          </a>

          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class=""> </span>
          </button>

          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav  mx-auto ">
              <li class="nav-item">
                <a class="nav-link" href="Burger_home.jsp">Home </a>
              </li>
              <li class="nav-item active">
                <a class="nav-link" href="menu.jsp">Menu <span class="sr-only">(current)</span> </a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="about.jsp">About</a>
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
    <!-- end header section -->
  </div>

  <!-- food section -->

  <section class="food_section layout_padding">
    <div class="container">
      <div class="heading_container heading_center">
        <h2>
          Our Menu
        </h2>
      </div>

      <ul class="filters_menu">
        <li class="active" data-filter="*">All</li>
        <li data-filter=".burger">Burger</li>
        <li data-filter=".pizza">Pizza</li>
        <li data-filter=".pasta">Pasta</li>
        <li data-filter=".fries">Fries</li>
      </ul>

      <div class="filters-content">
        <div class="row grid">
        <div class="menu-container">
          <div class="col-sm-6 col-lg-4 all pizza">
        
    <div class="menu-card">
      <img src="images/f1.png" alt="Pizza">
      <div class="card-content">
        <h3>Margherita Pizza</h3>
        <p>Classic cheese pizza with fresh basil and tomato sauce.</p>
        <div class="price">$10</div>
         <input type="submit" class="btn" onclick="addItemAndRedirect(Margherita Pizza, $10,images/f1.png )" value="Add to Cart">
      </div>
    </div>

  </div>
          
          <div class="col-sm-6 col-lg-4 all pizza">
    <div class="menu-card">
      <img src="images/f3.png" alt="Pizza">
      <div class="card-content">
        <h3>Italian Cheese Pizza</h3>
        <p>Italian Cheese pizza with fresh basil and tomato sauce.</p>
        <div class="price">$15</div>
        <a href="AddToCart.jsp" style="text-decoration: none" class="btn">Add to Cart</a>
      </div>
    </div>
  
          </div>
          <div class="col-sm-6 col-lg-4 all burger">
		  <div class="menu-card">
      <img src="images/f2.png" alt="Burger">
      <div class="card-content">
        <h3>Cheese Burger</h3>
        <p>Juicy beef patty with cheddar cheese and crispy lettuce.</p>
        <div class="price">$18</div>
       <a href="AddToCart.jsp" style="text-decoration: none" class="btn">Add to Cart</a>
      </div>
    </div>

          </div>
          <div class="col-sm-6 col-lg-4 all pasta">
           <div class="menu-card">
      <img src="images/f4.png" alt="Pasta">
      <div class="card-content">
        <h3>Alfredo Pasta</h3>
        <p>Creamy white sauce pasta topped with parmesan cheese.</p>
        <div class="price">$22</div>
        <a href="AddToCart.jsp" style="text-decoration: none" class="btn">Add to Cart</a>
      </div>
    </div>
          </div>
          <div class="col-sm-6 col-lg-4 all fries">
          <div class="menu-card">
      <img src="images/f5.png" alt="Pizza">
      <div class="card-content">
        <h3>Saluted French Fries</h3>
        <p>Saluted French Fries with fresh basil and tomato sauce.</p>
        <div class="price">$16</div>
        <a href="AddToCart.jsp" style="text-decoration: none" class="btn">Add to Cart</a>
      </div>
    </div>
           </div>
          <div class="col-sm-6 col-lg-4 all pizza">
   <div class="menu-card">
      <img src="images/o2.jpg" alt="Pizza">
      <div class="card-content">
        <h3>Double Cheese Pizza</h3>
        <p>Double Cheese Pizza with fresh basil and tomato sauce.</p>
        <div class="price">$22</div>
         <a href="AddToCart.jsp" style="text-decoration: none" class="btn">Add to Cart</a>
      </div>
    </div>
          </div>
          <div class="col-sm-6 col-lg-4 all burger">
<div class="menu-card">
      <img src="images/f7.png" alt="Pizza">
      <div class="card-content">
        <h3>Double Cheese Burger</h3>
        <p>Double Cheese Burger with fresh basil and tomato sauce.</p>
        <div class="price">$19</div>
        <a href="AddToCart.jsp" style="text-decoration: none" class="btn">Add to Cart</a>
      </div>
    </div>
          </div>
          <div class="col-sm-6 col-lg-4 all burger">
       <div class="menu-card">
      <img src="images/o1.jpg" alt="Pizza">
      <div class="card-content">
        <h3>Tandori Butter Cheese Burger</h3>
        <p>Tandori Butter Cheese Burger with fresh basil and tomato sauce.</p>
        <div class="price">$15</div>
        <a href="AddToCart.jsp" style="text-decoration: none" class="btn">Add to Cart</a>
      </div>
    </div>
          </div>
          <div class="col-sm-6 col-lg-4 all pasta">
<div class="menu-card">
      <img src="images/f9.png" alt="Pizza">
      <div class="card-content">
        <h3>Italian style Pasta</h3>
        <p>Italian style Pasta with fresh basil and tomato sauce.</p>
        <div class="price">$17</div>
        <a href="AddToCart.jsp" style="text-decoration: none" class="btn">Add to Cart</a>
      </div>
    </div>
          </div>
       
        </div>
      </div>
      
    </div>
    </div>
  </section>

  <!-- end food section -->

  <!-- footer section -->
  <footer class="footer_section">
    <div class="container">
      <div class="row">
        <div class="col-md-4 footer-col">
          <div class="footer_contact">
            <h4>
              Contact Us
            </h4>
            <div class="contact_link_box">
              <a href="">
                <i class="fa fa-map-marker" aria-hidden="true"></i>
                <span>
                  Location
                </span>
              </a>
              <a href="">
                <i class="fa fa-phone" aria-hidden="true"></i>
                <span>
                  Call +01 1234567890
                </span>
              </a>
              <a href="">
                <i class="fa fa-envelope" aria-hidden="true"></i>
                <span>
                  demo@gmail.com
                </span>
              </a>
            </div>
          </div>
        </div>
        <div class="col-md-4 footer-col">
          <div class="footer_detail">
            <a href="" class="footer-logo">
              Feane
            </a>
            <p>
              Necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with
            </p>
            <div class="footer_social">
              <a href="">
                <i class="fa fa-facebook" aria-hidden="true"></i>
              </a>
              <a href="">
                <i class="fa fa-twitter" aria-hidden="true"></i>
              </a>
              <a href="">
                <i class="fa fa-linkedin" aria-hidden="true"></i>
              </a>
              <a href="">
                <i class="fa fa-instagram" aria-hidden="true"></i>
              </a>
              <a href="">
                <i class="fa fa-pinterest" aria-hidden="true"></i>
              </a>
            </div>
          </div>
        </div>
        <div class="col-md-4 footer-col">
          <h4>
            Opening Hours
          </h4>
          <p>
            Everyday
          </p>
          <p>
            10.00 Am -10.00 Pm
          </p>
        </div>
      </div>
      <div class="footer-info">
        <p>
          &copy; <span id="displayYear"></span> All Rights Reserved By
          <a href="https://html.design/">Free Html Templates</a><br><br>
          &copy; <span id="displayYear"></span> Distributed By
          <a href="https://themewagon.com/" target="_blank">ThemeWagon</a>
        </p>
      </div>
    </div>
  </footer>
  <!-- footer section -->

  <!-- jQery -->
  <script src="js/jquery-3.4.1.min.js"></script>
  <!-- popper js -->
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous">
  </script>
  <!-- bootstrap js -->
  <script src="js/bootstrap.js"></script>
  <!-- owl slider -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js">
  </script>
  <!-- isotope js -->
  <script src="https://unpkg.com/isotope-layout@3.0.4/dist/isotope.pkgd.min.js"></script>
  <!-- nice select -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-nice-select/1.1.0/js/jquery.nice-select.min.js"></script>
  <!-- custom js -->
  <script src="js/custom.js"></script>
  <!-- Google Map -->
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCh39n5U-4IoWpsVGUHWdqB6puEkhRLdmI&callback=myMap">
  </script>
  <!-- End Google Map -->
  <script>
//A global array to store cart items.
// Function to add an item to the cart and save it to localStorage.
function addItemAndRedirect(name, price, imageUrl) {
  // Retrieve the existing cart from localStorage or create a new one.
  let cart = JSON.parse(localStorage.getItem('cart')) || [];
  
  // Create the new item object.
  const newItem = {
    name: name,
    price: price,
    imageUrl: imageUrl
  };
  
  // Add the new item to the cart array.
  cart.push(newItem);
  
  // Save the updated cart array back to localStorage.
  localStorage.setItem('cart', JSON.stringify(cart));
  
  // Redirect the user to the cart page.
  window.location.href = 'AddToCart.jsp'; // Replace with your cart page filename.
}
//Function to render the cart's content on the page with images.
  function renderCart() {
    const cartContainer = document.querySelector('.cart-container');
    cartContainer.innerHTML = ''; // Clear existing content.

    if (cart.length === 0) {
      cartContainer.innerHTML = `
        <h2 class="your-cart-heading">Your Cart</h2>
        <p class="empty-cart-message">Continue Shopping</p>
        <p class="empty-cart-message">Your cart is empty.</p>
      `;
      document.getElementById('proceed-to-checkout').disabled = true;
      return;
    }

    // Loop through the cart and create a new HTML element for each item.
    cart.forEach(item => {
      const itemElement = document.createElement('div');
      itemElement.classList.add('cart-item');
      itemElement.innerHTML = `
        <div class="cart-item-info">
          <img src="${item.imageUrl}" alt="${item.name}" class="cart-item-image">
          <div>
            <p class="cart-item-name">${item.name}</p>
            <p class="cart-item-price">Price: $${item.price.toFixed(2)}</p>
          </div>
        </div>
        <button onclick="removeItemFromCart('${item.name}')" class="remove-btn">Remove</button>
      `;
      cartContainer.appendChild(itemElement);
    });

    // Display the total price (this part remains the same).
    const total = calculateCartTotal();
    const totalElement = document.createElement('div');
    totalElement.innerHTML = `<h3>Total: $${total.toFixed(2)}</h3>`;
    cartContainer.appendChild(totalElement);

    // Enable the checkout button.
    document.getElementById('proceed-to-checkout').disabled = false;
  }

</script>

</body>

</html>
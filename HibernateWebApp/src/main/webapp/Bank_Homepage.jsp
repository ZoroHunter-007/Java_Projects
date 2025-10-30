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
  <link rel="shortcut icon" href="imges/bank_logo.jpg" type="">
  <title>Banking Application</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
  <style>
    /* ------------------------------
   GLOBAL THEME
------------------------------ */
body {
  font-family: 'Poppins', sans-serif;
  background-color: #f0f4f8;
  color: #333;
}

h1, h2, h4, h5 {
  font-weight: 600;
}

a {
  text-decoration: none;
}

.btn:focus,
.form-control:focus {
  box-shadow: 0 0 8px rgba(0, 119, 182, 0.5);
  outline: none;
}

/* ------------------------------
   NAVBAR
------------------------------ */
.navbar {
  background: linear-gradient(to right, #003049, #0077b6);
  padding: 10px 20px;
}

.navbar-brand {
  font-weight: bold;
  font-size: 22px;
  color: #fff !important;
}

.navbar-nav .nav-link {
  color: #fff !important;
  margin: 0 8px;
  transition: color 0.3s;
}

.navbar-nav .nav-link:hover {
  color: #ffd60a !important;
}

/* ------------------------------
   HERO SECTION
------------------------------ */
.hero {
  background: linear-gradient(to right, #0077b6, #00b4d8);
  color: white;
  padding: 100px 20px;
  text-align: center;
  border-bottom-left-radius: 50px;
  border-bottom-right-radius: 50px;
}

.hero h1 {
  font-size: 48px;
  font-weight: 700;
}

.hero p {
  font-size: 18px;
  opacity: 0.9;
}

.hero .btn {
  background: #fff;
  color: #0077b6;
  border-radius: 25px;
  padding: 10px 25px;
  font-weight: 500;
  transition: all 0.3s ease;
}

.hero .btn:hover {
  background: #0077b6;
  color: #fff;
}

/* ------------------------------
   DASHBOARD SECTION
------------------------------ */
#dashboard h2 {
  color: #0077b6;
  font-weight: 600;
}

.nav-tabs .nav-link {
  color: #0077b6;
  font-weight: 500;
}

.nav-tabs .nav-link.active {
  background: #0077b6;
  color: white;
  border-radius: 10px 10px 0 0;
}

/* ------------------------------
   ACCOUNT SUMMARY CARD
------------------------------ */
.card {
  border-radius: 12px;
  transition: transform 0.3s ease, box-shadow 0.3s ease;
}

.card:hover {
  transform: translateY(-5px);
  box-shadow: 0px 6px 15px rgba(0, 0, 0, 0.1);
}

.list-group-item {
  font-size: 15px;
}

/* ------------------------------
   TRANSACTION FORM
------------------------------ */
.transaction-container {
  background: #ffffff;
  border-radius: 15px;
  box-shadow: 0 6px 18px rgba(0, 0, 0, 0.1);
  padding: 35px 40px;
  text-align: center;
}

.transaction-container h2 {
  color: #0077b6;
  font-weight: 600;
  margin-bottom: 25px;
}

.transaction-container .form-group label {
  font-weight: 500;
  color: #333;
  margin-bottom: 5px;
  display: block;
  text-align: left;
}

.transaction-container input[type="text"],
.transaction-container select {
  width: 100%;
  padding: 10px;
  border-radius: 10px;
  border: 1px solid #ccc;
  transition: all 0.3s ease;
  font-size: 15px;
}

.transaction-container input[type="text"]:focus,
.transaction-container select:focus {
  border-color: #0077b6;
  box-shadow: 0 0 6px rgba(0, 119, 182, 0.4);
}

.transaction-container input[type="button"] {
  background: linear-gradient(to right, #0077b6, #00b4d8);
  color: white;
  border: none;
  border-radius: 10px;
  padding: 12px 20px;
  width: 100%;
  font-size: 16px;
  cursor: pointer;
  transition: all 0.3s ease;
}

.transaction-container input[type="button"]:hover {
  background: linear-gradient(to right, #023e8a, #0077b6);
  transform: scale(1.02);
}

/* ------------------------------
   ACCOUNT DETAILS FORM
------------------------------ */
.auth-card {
  background: #fff;
  border-radius: 15px;
  box-shadow: 0 5px 15px rgba(0,0,0,0.1);
  padding: 35px 30px;
}

.auth-title {
  color: #0077b6;
  font-weight: 600;
  margin-bottom: 20px;
  text-align: center;
}

.auth-card input[type="submit"] {
  background: #ffb703;
  color: #000;
  font-weight: 600;
  border-radius: 25px;
  border: none;
  padding: 10px 20px;
  transition: all 0.3s ease;
}

.auth-card input[type="submit"]:hover {
  background: #f48c06;
  transform: translateY(-2px);
}

/* ------------------------------
   TABLE STYLE
------------------------------ */
.table thead {
  background: #0077b6;
  color: white;
}

.table-striped tbody tr:nth-of-type(odd) {
  background-color: #f2f9fc;
}

/* ------------------------------
   FOOTER
------------------------------ */
footer {
  background: #003049;
  color: white;
  padding: 15px 0;
  text-align: center;
  font-size: 15px;
  margin-top: 60px;
}

/* ------------------------------
   MODAL LOGIN & REGISTER
------------------------------ */
.modal-content {
  border-radius: 15px;
  box-shadow: 0 10px 25px rgba(0,0,0,0.2);
}

.modal-header {
  background: #0077b6;
  color: white;
  border-top-left-radius: 15px;
  border-top-right-radius: 15px;
}

.modal-title {
  font-weight: 600;
}

.nav-pills .nav-link.active {
  background: #0077b6;
}

.nav-pills .nav-link {
  color: #0077b6;
  font-weight: 500;
}

/* ------------------------------
   RESPONSIVE DESIGN
------------------------------ */
@media (max-width: 768px) {
  .hero {
    padding: 70px 10px;
  }
  .hero h1 {
    font-size: 36px;
  }
  .transaction-container {
    padding: 25px 20px;
  }
}
#transferField {
  animation: fadeIn 0.3s ease;
}

@keyframes fadeIn {
  from { opacity: 0; transform: translateY(-5px); }
  to { opacity: 1; transform: translateY(0); }
}


  </style>
  
</head>
<body>

  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid d-flex justify-content-between align-items-center">
      <a class="navbar-brand ms-2" href="#">🏦 MyBank</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item"><a class="nav-link active" href="#">Home</a></li>
          <li class="nav-item"><a class="nav-link" href="#dashboard">Dashboard</a></li>
          
          <li class="nav-item">
             <a class="nav-link" href="#" data-bs-toggle="modal" data-bs-target="#authModal" title="Sign In / Register">
                 <i class="fa fa-user me-1"></i>
             </a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <section class="hero">
    <h1>Welcome to MyBank</h1>
    <p>Your trusted partner for secure banking</p>
    <a href="#dashboard" class="btn btn-light btn-lg mt-3">Go to Dashboard</a>
  </section>

  <section class="container my-5" id="dashboard">
    <h2 class="text-center mb-4">User Dashboard</h2>
    
    <ul class="nav nav-tabs" id="myTab" role="tablist">
      <li class="nav-item" role="presentation">
        <button class="nav-link active" id="summary-tab" data-bs-toggle="tab" data-bs-target="#summary" type="button" role="tab" aria-controls="summary" aria-selected="true">Account Summary</button>
      </li>
      <li class="nav-item" role="presentation">
        <button class="nav-link" id="transaction-tab" data-bs-toggle="tab" data-bs-target="#transaction" type="button" role="tab" aria-controls="transaction" aria-selected="false">Transaction</button>
      </li>
      <li class="nav-item" role="presentation">
        <button class="nav-link" id="account-tab" data-bs-toggle="tab" data-bs-target="#account" type="button" role="tab" aria-controls="account" aria-selected="false">Enter Account Details</button>
      </li>
    </ul>

    <div class="tab-content border border-top-0 p-3" id="myTabContent">
      <div class="tab-pane fade show active" id="summary" role="tabpanel" aria-labelledby="summary-tab">
        <div class="row">
          <div class="col-md-4">
            <div class="card shadow p-3 mb-3">
              <h5>Account Summary</h5>
              <ul class="list-group list-group-flush">
                <li class="list-group-item">Account Holder: John Doe</li>
                <li class="list-group-item">Account Number: 123456</li>
                <li class="list-group-item">Balance: ₹5000</li>
              </ul>
            </div>
          </div>
          <div class="col-md-8">
            <div class="card shadow p-3">
              <h5>Transaction History</h5>
              <table class="table table-striped mb-0">
                <thead>
                  <tr><th>Date</th><th>Type</th><th>Amount</th><th>Balance</th></tr>
                </thead>
                <tbody>
                  <tr><td>2025-09-15</td><td>Deposit</td><td>₹1000</td><td>₹5000</td></tr>
                  <tr><td>2025-09-10</td><td>Withdraw</td><td>₹500</td><td>₹4000</td></tr>
                  <tr><td>2025-09-01</td><td>Transfer</td><td>₹200</td><td>₹4500</td></tr>
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
      
        <div class="tab-pane fade" id="transaction" role="tabpanel" aria-labelledby="transaction-tab">
        <div class="row justify-content-center">
            <div class="col-md-6">
              <div class="transaction-container">
              <form action="TransactionServlet" method="post">
        <h2>💰 Transaction</h2>
        <div class="form-group">
        
            <label for="amount">Amount</label>
            <input type="text" id="amount" placeholder="Enter amount" name="amount">
        </div>

        <div class="form-group">
            <label for="accountNumber">Account Number</label>
            <input type="text" id="accountNumber" placeholder="Enter account number" name="accountNumber">
        </div>
			       <!-- Hidden field for Transfer -->
  <div class="form-group" id="transferField" style="display:none;">
    <label for="transferAccount">Transfer To Account Number</label>
    <input type="text" id="transferAccount" placeholder="Enter destination account number" class="form-control" name="transferAccount">
  </div>
        <div class="form-group">
            <label for="type">Transaction Type:</label>
            <select id="type" name="type" onchange="toggleTransferField()">
                <option value="deposit">Deposit</option>
                <option value="withdraw">Withdraw</option>
                <option value="transfer">Transfer</option>
            </select>
        </div>
	
  

  <input type="submit" value="Submit Transaction" class="btn btn-primary w-100 mt-3">
    </form>
    </div>
   
            </div>
        </div>
      </div>
      
     
      
       <div class="tab-pane fade" id="account" role="tabpanel" aria-labelledby="account-tab">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="auth-card">
                  <h4 class="auth-title">Enter Account Details</h4>
                  <form action="acc" method="post">
                    <div class="mb-3">
                      <label for="withdrawAccount" class="form-label">Enter Account Number</label>
                      <input type="text" name="account_num" class="form-control form-control-sm" id="withdrawAccount" placeholder="Enter account number" min="0.01" step="0.01" required>
                    </div>
                    <div class="mb-3">
                      <label for="withdrawAccount" class="form-label">Account Holder Name</label>
                      <input type="text" name="holder_nm" class="form-control form-control-sm" id="withdrawAccount" placeholder="Enter account holder name" required>
                    </div>
                    <div class="mb-3">
                      <label for="withdrawAccount" class="form-label">Enter Account Type</label>
                      <input type="text" name="account_type" class="form-control form-control-sm" id="withdrawAccount" placeholder="Enter account type"  required>
                    </div>
                    <div class="mb-3">
                      <label for="withdrawAccount" class="form-label">Enter Balance</label>
                      <input type="text" name="balance" class="form-control form-control-sm" id="withdrawAccount" placeholder="Enter Balance"  required>
                    </div>
                    <div class="d-flex justify-content-center"> 
                      <input type="submit" class="btn btn-warning" value="Insert Account Details">
                    </div>
                  </form>
                </div>
            </div>
        </div>
      </div>
      
      
    </div>
  </section>

  <footer>
    <p>&copy; 2025 MyBank. All Rights Reserved.</p>
  </footer>

  <div class="modal fade" id="authModal" tabindex="-1" aria-labelledby="authModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="authModalLabel">Access Your Account</h5>
          <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
        </div>
        <div class="modal-body p-4">
          
          <ul class="nav nav-pills nav-justified mb-4" id="authTabs" role="tablist">
            <li class="nav-item" role="presentation">
              <button class="nav-link active" id="login-tab" data-bs-toggle="tab" data-bs-target="#modal-login" type="button" role="tab" aria-controls="modal-login" aria-selected="true">Login</button>
            </li>
            <li class="nav-item" role="presentation">
              <button class="nav-link" id="register-tab" data-bs-toggle="tab" data-bs-target="#modal-register" type="button" role="tab" aria-controls="modal-register" aria-selected="false">Register</button>
            </li>
          </ul>

          <div class="tab-content">
            
            <div class="tab-pane fade show active" id="modal-login" role="tabpanel" aria-labelledby="login-tab">
              <h4 class="auth-title">Login to Your Account</h4>
              <form action="Login" method="post">
                <div class="mb-3 input-group">
                  <span class="input-group-text"><i class="fa fa-envelope"></i></span>
                  <input type="email" class="form-control" placeholder="Email" required name="email">
                </div>
                <div class="mb-3 input-group">
                  <span class="input-group-text"><i class="fa fa-lock"></i></span>
                  <input type="password" class="form-control" placeholder="Password" required name="password">
                </div>
                <input type="submit" class="btn btn-success w-100" value="Login">
              </form>
            </div>

            <div class="tab-pane fade" id="modal-register" role="tabpanel" aria-labelledby="register-tab">
              <h4 class="auth-title">Create an Account</h4>
              <form action="RegisterPage" method="post">
                <div class="mb-3 input-group">
                  <span class="input-group-text"><i class="fa fa-user"></i></span>
                  <input type="text" class="form-control" placeholder="Full Name" required  name="fullname">
                </div>
                <div class="mb-3 input-group">
                  <span class="input-group-text"><i class="fa fa-envelope"></i></span>
                  <input type="email" class="form-control" placeholder="Email" required name="email">
                </div>
                <div class="mb-3 input-group">
                  <span class="input-group-text"><i class="fa fa-phone"></i></span>
                  <input type="text" class="form-control" placeholder="Phone Number" required name="pno">
                </div>
                <div class="mb-3 input-group">
                  <span class="input-group-text"><i class="fa fa-lock"></i></span>
                  <input type="password" class="form-control" placeholder="Password" required name="password">
                </div>
             <!--    <div class="mb-3 input-group">
                  <span class="input-group-text"><i class="fa fa-image"></i></span>
                  <input type="file" class="form-control" placeholder="Upload image" required name="image">
                </div>  -->
                <input type="submit" class="btn btn-primary w-100" value="Register">
              </form>
            </div>
            
          </div>
        </div>
      </div>
    </div>
  </div>


  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  <script>
  function toggleTransferField() {
    const type = document.getElementById("type").value;
    const transferField = document.getElementById("transferField");

    if (type === "transfer") {
      transferField.style.display = "block";
    } else {
      transferField.style.display = "none";
    }
  }
</script>
  
</body>
</html>
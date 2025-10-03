<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Banking Application Template</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
  <style>
    body { font-family: Arial, sans-serif; background-color: #f8f9fa; }
    .hero { background: linear-gradient(to right, #0077b6, #00b4d8); color: white; padding: 100px 20px; text-align: center; }
    .card { transition: transform 0.3s ease; }
    .card:hover { transform: translateY(-5px); }
    footer { background: #212529; color: white; padding: 15px 0; text-align: center; margin-top: 40px; }
    .form-control:focus { border-color: #0077b6; box-shadow: 0 0 5px rgba(0,119,182,0.5); }
    .auth-card { background: #fff; border-radius: 12px; padding: 30px; box-shadow: 0px 4px 15px rgba(0,0,0,0.1); }
    .auth-title { font-weight: bold; color: #0077b6; margin-bottom: 20px; text-align: center; }
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
        <button class="nav-link" id="deposit-tab" data-bs-toggle="tab" data-bs-target="#deposit" type="button" role="tab" aria-controls="deposit" aria-selected="false">Deposit</button>
      </li>
      <li class="nav-item" role="presentation">
        <button class="nav-link" id="withdraw-tab" data-bs-toggle="tab" data-bs-target="#withdraw" type="button" role="tab" aria-controls="withdraw" aria-selected="false">Withdraw</button>
      </li>
      <li class="nav-item" role="presentation">
        <button class="nav-link" id="transfer-tab" data-bs-toggle="tab" data-bs-target="#transfer" type="button" role="tab" aria-controls="transfer" aria-selected="false">Transfer</button>
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
                <li class="list-group-item">Balance: $5000</li>
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
                  <tr><td>2025-09-15</td><td>Deposit</td><td>$1000</td><td>$5000</td></tr>
                  <tr><td>2025-09-10</td><td>Withdraw</td><td>$500</td><td>$4000</td></tr>
                  <tr><td>2025-09-01</td><td>Transfer</td><td>$200</td><td>$4500</td></tr>
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
      
        <div class="tab-pane fade" id="deposit" role="tabpanel" aria-labelledby="deposit-tab">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="auth-card">
                  <h4 class="auth-title">Make a Deposit</h4>
                  <form>
                    <div class="mb-3">
                      <label for="depositAmount" class="form-label">Amount</label>
                      <input type="number" class="form-control form-control-sm" id="depositAmount" placeholder="Enter amount" min="0.01" step="0.01" required>
                    </div>
                    <div class="mb-3">
                      <label for="depositAccount" class="form-label">Account Number</label>
                      <input type="text" class="form-control form-control-sm" id="depositAccount" placeholder="Enter account number" required>
                    </div>
                    <div class="d-flex justify-content-center"> 
                      <button type="submit" class="btn btn-primary">Submit Deposit</button>
                    </div>
                  </form>
                </div>
            </div>
        </div>
      </div>
      
      <div class="tab-pane fade" id="withdraw" role="tabpanel" aria-labelledby="withdraw-tab">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="auth-card">
                  <h4 class="auth-title">Withdraw Funds</h4>
                  <form>
                    <div class="mb-3">
                      <label for="withdrawAmount" class="form-label">Amount</label>
                      <input type="number" class="form-control form-control-sm" id="withdrawAmount" placeholder="Enter amount" min="0.01" step="0.01" required>
                    </div>
                    <div class="mb-3">
                      <label for="withdrawAccount" class="form-label">Account Number</label>
                      <input type="text" class="form-control form-control-sm" id="withdrawAccount" placeholder="Enter account number" required>
                    </div>
                    <div class="d-flex justify-content-center"> 
                      <button type="submit" class="btn btn-warning">Submit Withdrawal</button>
                    </div>
                  </form>
                </div>
            </div>
        </div>
      </div>

      <div class="tab-pane fade" id="transfer" role="tabpanel" aria-labelledby="transfer-tab">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="auth-card">
                  <h4 class="auth-title">Transfer Funds</h4>
                  <form>
                    <div class="mb-3">
                      <label for="transferAmount" class="form-label">Amount</label>
                      <input type="number" class="form-control form-control-sm" id="transferAmount" placeholder="Enter amount" min="0.01" step="0.01" required>
                    </div>
                    <div class="mb-3">
                      <label for="recipientAccount" class="form-label">Recipient Account Number</label>
                      <input type="text" class="form-control form-control-sm" id="recipientAccount" placeholder="Enter recipient account" required>
                    </div>
                    <div class="mb-3">
                      <label for="fromAccount" class="form-label">From Account Number</label>
                      <input type="text" class="form-control form-control-sm" id="fromAccount" placeholder="Enter your account number" required>
                    </div>
                    <div class="d-flex justify-content-center"> 
                      <button type="submit" class="btn btn-success">Submit Transfer</button>
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
              <form action="Register" method="post" enctype="multipart/form-data">
                <div class="mb-3 input-group">
                  <span class="input-group-text"><i class="fa fa-user"></i></span>
                  <input type="text" class="form-control" placeholder="Full Name" required  name="username">
                </div>
                <div class="mb-3 input-group">
                  <span class="input-group-text"><i class="fa fa-envelope"></i></span>
                  <input type="text" class="form-control" placeholder="Phone Number" required name="pno">
                </div>
                <div class="mb-3 input-group">
                  <span class="input-group-text"><i class="fa fa-phone"></i></span>
                  <input type="email" class="form-control" placeholder="Email" required name="email">
                </div>
                <div class="mb-3 input-group">
                  <span class="input-group-text"><i class="fa fa-lock"></i></span>
                  <input type="password" class="form-control" placeholder="Password" required name="password">
                </div>
                <div class="mb-3 input-group">
                  <span class="input-group-text"><i class="fa fa-image"></i></span>
                  <input type="file" class="form-control" placeholder="Upload image" required name="image">
                </div>
                <input type="submit" class="btn btn-primary w-100" value="Register">
              </form>
            </div>
            
          </div>
        </div>
      </div>
    </div>
  </div>


  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
  
</body>
</html>
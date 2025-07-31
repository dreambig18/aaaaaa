<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registration Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
  body {
    background: linear-gradient(120deg, #ff6b6b, #50c878);
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 0;
    padding: 0;
  }
  .registration-container {
    background-color: rgba(255, 255, 255, 0.9);
    border-radius: 10px;
    padding: 40px;
    box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
    max-width: 400px;
    width: 100%;
  }
  .registration-heading {
    text-align: center;
    margin-bottom: 30px;
  }
  .form-group {
    margin-bottom: 20px;
  }
  .form-control {
    border-radius: 20px;
  }
  .btn-register {
    border-radius: 20px;
    padding: 10px 30px;
    background-color: #4CAF50;
    color: #fff;
    border: none;
    transition: background-color 0.3s;
    width: 100%;
  }
  .btn-register:hover {
    background-color: #45a049;
  }
</style>
</head>
<body>

<div class="registration-container">
  <h2 class="registration-heading">Register Here</h2>
  <form id="registrationForm" action="RegisterController" method="post">
    
    <div class="form-group">
      <input type="text" class="form-control" id="fname" name="fname" placeholder="First Name" required>
    </div>
    
    <div class="form-group">
      <input type="text" class="form-control" id="lname" name="lname" placeholder="Last Name" required>
    </div>
    
    
    
    <div class="form-group">
      <input type="text" class="form-control" id="city" name="city" placeholder="City" required>
    </div>
    
    <div class="form-group">
    <input type="tel" class="form-control" id="phone" name="phone" placeholder="Phone Number" required>
</div>
    
    
    <div class="form-group">
      <input type="text" class="form-control" id="username" name="username" placeholder="Username" required>
    </div>
    
    <div class="form-group">
      <input type="password" class="form-control" id="password" name="password" placeholder="Password" required>
    </div>
    
    <button type="submit" class="btn btn-register">Register</button>
  </form>
</div>

</body>
</html>

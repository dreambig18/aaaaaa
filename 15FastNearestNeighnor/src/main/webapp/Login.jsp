<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
  body {
    background: linear-gradient(120deg, #f4acb7, #dee2ff);
    height: 100vh;
    display: flex;
    
    justify-content: center;
    align-items: center;
    margin: 0;
    padding: 0;
  }
  .login-container {
  width:400px;
    background-color: #d8e2dc;
    border-radius: 10px;
    padding: 30px;
    box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
  }
  .form-group {
    margin-bottom: 40px;
  }
  .form-control {
    border-radius: 20px;
  }
  .btn-login {
    border-radius: 20px;
    padding: 10px 30px;
    background-color: #4CAF50;
    color: #d8e2dc;
    transition: background-color 0.3s;
  }
  .btn-login:hover {
    background-color: #45a049;
  }
</style>
</head>
<body>
<%@include file="/navbar.jsp"%>
<div class="login-container">
  <h2 class="text-center mb-4">Login</h2>
  <form id="loginForm" action="loginController" method="post">
    <div class="form-group">
      <input type="email" class="form-control" name="email" placeholder="Email" required>
    </div>
    <div class="form-group">
      <input type="password" class="form-control" name="password" placeholder="Password" required>
    </div>
    <button type="submit" class="btn btn-login btn-block">Login</button>
  </form>
</div>

</body>
</html>


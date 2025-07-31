
<%@page import="shop.model.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%
	User auth = (User) request.getSession().getAttribute("auth");
	if (auth != null) {
		response.sendRedirect("index.jsp");
	}
	ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
	if (cart_list != null) {
		request.setAttribute("cart_list", cart_list);
	}
	%>
<!DOCTYPE html>
<html>
<head>



<%@include file="/head.jsp"%>



<meta charset="ISO-8859-1">
<title>Shop Web</title>
<style>
  body {
    background-image: url('https://img.freepik.com/premium-photo/top-view-online-shopping-concept-with-credit-card-smart-phone-computer-isolated-office-yellow-table-background_315337-5991.jpg');
    background-size: cover;
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-position: center center;
    color: #333; /* Change the font color to your preference */
    font-family: Arial, sans-serif;
  }

  .card {
    border: 1px solid #ccc;
    border-radius: 10px;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    margin-top: 20px;
    padding: 20px;
  }

  .card-header {
    background-color: #007bff; /* Change the header background color to your preference */
    color: white;
    text-align: center;
    padding: 10px;
    border-radius: 10px 10px 0 0;
  }

  .card-body {
    background-color: #fff; /* Change the body background color to your preference */
    border-radius: 0 0 10px 10px;
  }

  input[type="email"],
  input[type="password"],
  .btn {
    margin-top: 10px;
  }

  .btn:hover {
    background-color: #0056b3; /* Change the hover color for buttons */
  }
</style>

</head>
<body><%@include file="/navbar.jsp"%>

	<div class="container">
		<div class="card w-50 mx-auto my-5">
			<div class="card-header text-center">User Login</div>
			<div class="card-body">
				<form action="user-login" method="post">
					<div class="form-group">
						<label>Email address</label> 
						<input type="email" name="login-email" class="form-control" placeholder="Enter email">
					</div>
					<div class="form-group">
						<label>Password</label> 
						<input type="password" name="login-password" class="form-control" placeholder="Password">
					</div>
					<div class="text-center">
						<button type="submit" class="btn btn-primary">Login</button>
					</div>
				<div class="card-footer text-center">
                <%
                // Check if a user is signed in by examining a session variable or some other mechanism
                boolean isUserSignedIn = (session.getAttribute("userSession") != null);

                if (!isUserSignedIn) {
                %>
                    <!-- Display the "Sign Up" button if there is no signed-in user -->
                    <a href="signup.jsp" class="btn btn-secondary">Sign Up</a>
                <%
                }
                %>
            </div>
        </div>
    </div>

	<%@include file="/footer.jsp"%>
</body>
</html>
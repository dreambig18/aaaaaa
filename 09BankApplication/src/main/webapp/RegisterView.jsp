<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Here</title>
    <link rel="icon" type="image/x-icon" href="/images/favicon.ico">
    <!-- bootstrap Links -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    <!-- CSS links -->
    <link rel="stylesheet" href="./RegistrationView.css">
    <!-- Font Awsome Links -->
    <script src="https://kit.fontawesome.com/474bdd0f32.js" crossorigin="anonymous"></script>
</head>
<body>
    
    <!-- <nav class="navbar navbar-expand-lg bg-body-tertiary"> -->
      <div class="container-fluid">
          
  
 
    <div class="container">
    
       
       <div class="container h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
          <div class="col-lg-12 col-xl-11">
            <div class="card text-black" style="border-radius: 25px;">
              <div class="card-body p-md-5">
                <div class="row justify-content-center">
                  <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">
                    <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Sign up</p>
                      <!-- <form class="mx-1 mx-md-4"> -->
                        <form action="RegisterViewController">
                          <div class="d-flex flex-row align-items-center mb-4">
                            <i class="fas fa-user fa-lg me-3 fa-fw"></i>
                            <div class="form-outline flex-fill mb-0">
                              <td style="font-weight: bold;">Enter Register No</td>
                              <td><input type="number" name="regNo"></td>                     
                            </div>
                          </div>
                          <div class="d-flex flex-row align-items-center mb-4">
                            <i class="fas fa-user fa-lg me-3 fa-fw"></i>
                            <div class="form-outline flex-fill mb-0">
                              <td style="font-weight: bold;">Customer Name</td>
                              <td><input type="text" name="custName"></td>
                            </div>
                          </div>
                          <div class="d-flex flex-row align-items-center mb-4">
                            <i class="fas fa-user fa-lg me-3 fa-fw"></i>
                            <div class="form-outline flex-fill mb-0">
                              <td style="font-weight: bold;">Enter username</td>
                              <td><input type="text" name="username"></td>
                            </div>
                          </div>
                          <div class="d-flex flex-row align-items-center mb-4">
                            <i class="fas fa-lock fa-lg me-3 fa-fw"></i>
                            <div class="form-outline flex-fill mb-0">
                              <td style="font-weight: bold;">Enter Password</td>
                              <td><input type="text" name="password"></td>
                            </div>
                          </div>
                          <div class="d-flex flex-row align-items-center mb-4">
                            <i class="fas fa-user fa-lg me-3 fa-fw"></i>
                            <div class="form-outline flex-fill mb-0">
                              <td style="font-weight: bold;">Enter Balance</td>
                              <td><input type="text" name="accBal"></td>
                            </div>
                          </div>
                          <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
                            <button ><td><input type="submit" value="Submit"></td></button> 
                          </div>
                        </form>
                      
                  </div>
                  <div class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">   
                    <img src="https://media.istockphoto.com/id/1281150061/vector/register-account-submit-access-login-password-username-internet-online-website-concept.jpg?s=612x612&w=0&k=20&c=9HWSuA9IaU4o-CK6fALBS5eaO1ubnsM08EOYwgbwGBo="
                      class="img-fluid" alt="Sample image">   
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div> 
  </div>
</body>
</html>


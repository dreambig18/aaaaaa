
<style>
  body {
   z-index: 1;
   
   }

 /*   .container {
  
    max-width: 1200px;
    margin: 0 auto;
    padding: 20px;
    position: relative;Ensure shapes are positioned relative to the container 
  }
*/
  .content {
    background-color: #fff;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
    text-align: center;
    z-index: 1; /* Ensure content is above shapes */
  }

  /* Animated shapes */
  .shape {
  z-index: 1;
    position: absolute;
    border-radius: 50%;
    animation-duration: 6s;
    animation-timing-function: ease-in-out;
    animation-iteration-count: infinite;
  }

  .shape1 {
	
    width: 100px;
    height: 100px;
    background-color: #588157;
    top: 20%;
    left: -50px;
    animation-name: moveShape1;
  }

  .shape2 {
    width: 80px;
    height: 80px;
    background-color: #03045e;
    top: 40%;
    right: -50px;
    animation-name: moveShape2;
  }

  .shape3 {
    width: 120px;
    height: 120px;
    background-color: #495057;
    bottom: 10%;
    left: -50px;
    animation-name: moveShape3;
  }

  .shape4 {
    width: 60px;
    height: 60px;
    background-color: #3d405b;
    bottom: 50%;
    right: 10%;
    animation-name: moveShape4;
  }

  .shape5 {
    width: 90px;
    height: 90px;
    background-color: #023047;
    top: 70%;
    right: 5%;
    animation-name: moveShape5;
  }

  /* Add more shapes */
  .shape6 {
    width: 70px;
    height: 70px;
    background-color: #588157;
    bottom: 20%;
    left: 10%;
    animation-name: moveShape6;
  }

  .shape7 {
    width: 110px;
    height: 110px;
    background-color: #03045e;
    top: 60%;
    left: 5%;
    animation-name: moveShape7;
  }

  .shape8 {
    width: 50px;
    height: 50px;
    background-color: #495057;
    bottom: 30%;
    right: 15%;
    animation-name: moveShape8;
  }

  .shape9 {
    width: 80px;
    height: 80px;
    background-color: #3d405b;
    top: 80%;
    right: 10%;
    animation-name: moveShape9;
  }

  .shape10 {
    width: 120px;
    height: 120px;
    background-color: #023047;
    bottom: 5%;
    left: 5%;
    animation-name: moveShape10;
  }

  /* Responsive styles */
  @media screen and (max-width: 768px) {
    .shape {
      animation-duration: 4s;
    }
  }

  @media screen and (max-width: 576px) {
    .shape {
      animation-duration: 3s;
    }
  }

  /* Keyframe animations */
  @keyframes moveShape1 {
    0% { transform: translateX(-50px); }
      50% { transform: translateX(50px); } /* Halfway point */
    100% { transform: translateX(50px); }
  }

  @keyframes moveShape2 {
    0% { transform: translateX(50px); }
      50% { transform: translateX(50px); } /* Halfway point */
    100% { transform: translateX(-50px); }
  }

  @keyframes moveShape3 {
    0% { transform: translateX(-50px); }
      50% { transform: translateX(50px); } /* Halfway point */
    100% { transform: translateX(100px); }
  }

  @keyframes moveShape4 {
    0% { transform: translateY(50px); }
      50% { transform: translateX(50px); } /* Halfway point */
    100% { transform: translateY(-50px); }
  }

  @keyframes moveShape5 {
    0% { transform: translateY(-50px); }
      50% { transform: translateX(50px); } /* Halfway point */
    100% { transform: translateY(50px); }
  }

  /* Add more keyframe animations */
  @keyframes moveShape6 {
    0% { transform: translateY(20px); }
      50% { transform: translateX(50px); } /* Halfway point */
    100% { transform: translateY(-20px); }
  }

  @keyframes moveShape7 {
    0% { transform: translateY(-30px); }
      50% { transform: translateX(50px); } /* Halfway point */
    100% { transform: translateY(30px); }
  }

  @keyframes moveShape8 {
    0% { transform: translateY(40px); }
      50% { transform: translateX(50px); } /* Halfway point */
    100% { transform: translateY(-40px); }
  }

  @keyframes moveShape9 {
    0% { transform: translateY(-20px); }
      50% { transform: translateX(50px); } /* Halfway point */
    100% { transform: translateY(20px); }
  }

  @keyframes moveShape10 {
    0% { transform: translateY(50px); }
      50% { transform: translateX(50px); } /* Halfway point */
    100% { transform: translateY(-50px); }
  }
</style>
</head>

<body>

<body>
<!-- Animated shapes -->
<div class="shape shape1"></div>
<div class="shape shape2"></div>
<div class="shape shape3"></div>
<div class="shape shape4"></div>
<div class="shape shape5"></div>
<div class="shape shape6"></div>
<div class="shape shape7"></div>
<div class="shape shape8"></div>
<div class="shape shape9"></div>
<div class="shape shape10"></div>

</body>
</html>

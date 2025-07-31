<style>
  body {
    margin: 0;
    font-family: Arial, sans-serif;
  }
  .navbar {
    background-color: #003049;
    overflow: hidden;
    position: fixed;
    top: 0;
    width: 100%;
    z-index: 1000;
    transition: top 0.3s;
    display: flex; /* Use flexbox for centering */
    justify-content: center; /* Center the content horizontally */
  }
  .navbar a {
    display: inline-block; /* Change display to inline-block */
    color: #f2f2f2;
    text-align: center;
    padding: 14px 20px;
    text-decoration: none;
    font-size: 17px;
    border-radius: 50%; /* Make the links circular */
    margin: 0 10px; /* Add margin between links */
  }
  .navbar a:hover {
    background-color: #ddd;
    color: black;
  }
  .navbar a.active {
    background-color: #4CAF50;
    color: white;
  }
  .navbar .icon {
    display: none;
  }
  @media screen and (max-width: 600px) {
    .navbar a:not(:first-child) {display: none;}
    .navbar a.icon {
      float: right;
      display: block;
    }
  }
  @media screen and (max-width: 600px) {
    .navbar.responsive {
      position: fixed;
      top: 0;
      width: 100%;
    }
    .navbar.responsive .icon {
      position: absolute;
      right: 0;
      top: 0;
    }
    .navbar.responsive a {
      float: none;
      display: block;
      text-align: left;
    }
  }
</style>
</head>
<body>


<div class="navbar" id="myNavbar">
  <a href="#" class="active">Home</a>
  <a href="#">About</a>
  <a href="#">Services</a>
  <a href="#">Contact</a>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
    <i class="fa fa-bars"></i>
  </a>
</div>

<script>
  function myFunction() {
    var x = document.getElementById("myNavbar");
    if (x.className === "navbar") {
      x.className += " responsive";
    } else {
      x.className = "navbar";
    }
  }
</script>

</body>
</html>



<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Login page</title>
  <link rel="stylesheet" href="css/style.css" />
  <script src="https://kit.fontawesome.com/7b39153ed3.js" crossorigin="anonymous"></script>
</head>

<body>
  <div class="container" id="container">

    <!-- sign Up form section start-->
    <div class="form sign_up">
      <form action="#">
        <!-- heading -->
        <h1>Create An Account</h1>
        <!-- social media icons -->
        <div class="social-container">
          <a href="#"><i class="fa-brands fa-facebook"></i></a>
          <a href="#"><i class="fa-brands fa-google"></i></a>
          <a href="#"><i class="fa-brands fa-github"></i></a>
        </div>
        <span>use email for registration</span>
        <!-- input fields start -->
        <input type="text" placeholder="User Name">
        <input type="email" placeholder="Email">
        <input type="password" placeholder="Password">
        <button>Create Account</button>
        <!-- input fields end -->
      </form>
    </div>
    <!-- sign Up form section end-->

    <!-- sign in form section start-->
    <div class="form sign_in">
      <form action="loginhandler" method=POST modelAttribute=loginuser>
        <!-- heading -->
        <h1>Login In</h1>
        <!-- social media icons -->
        <div class="social-container">
          <a href="#"><i class="fa-brands fa-facebook"></i></a>
          <a href="#"><i class="fa-brands fa-google"></i></a>
          <a href="#"><i class="fa-brands fa-github"></i></a>
        </div>
        <span>Login In with your Account</span>
        <!-- input fields start -->
        <input type="text" placeholder="Name" name="name">
        <input type="password" placeholder="Password" name="password">
        <span>Forgot your <span class="forgot">password?</span></span>
        <button>Login</button>
        <!-- input fields end -->
      </form>
    </div>
    <!-- sign in form section end-->

    <!-- overlay section start-->
    <div class="overlay-container">
      <div class="overlay">
        <div class="overlay-pannel overlay-left">
          <h1>Already have an account</h1>
          <p>Please Login</p>
          <button id="signIn" class="overBtn">SignIn</button>
        </div>
       
        <div class="overlay-pannel overlay-right">
          <h1>Create Account</h1>
          <p>Start Your Journey with Us</p>
          <a href="/registers"><button id="signUp" class="overBtn">Sign Up</button></a>
        </div>

      </div>
    </div>
    <!-- overlay section start-->
  </div>
 
</body>

</html>
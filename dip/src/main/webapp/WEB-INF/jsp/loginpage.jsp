<!DOCTYPE html>
<html lang="en" >
<head>
  <meta charset="UTF-8">
  <title>Login</title>
  <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
<link rel="icon" type="image/x-icon" href="/images/p1.png">

<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous"><link rel="stylesheet" href="css/custom.css">

</head>
<body>
<div class="box-form">
	<div class="left">
		<div class="overlay">
		<h1>Welcome</h1>
		<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
		Curabitur et est sed felis aliquet sollicitudin</p>
		<span>
			<p>login with social media</p>
			<a href="https://www.facebook.com/"><i class="fa fa-facebook" aria-hidden="true"></i></a>
			<a href="https://www.twitter.com/"><i class="fa fa-twitter" aria-hidden="true"></i></a>
			
		</span>
		</div>
	</div>
	
	
		<div class="right">
		<h2>Login</h2>
		<form action="loginhandler" method=POST modelAttribute=loginuser>
		<div class="inputs">
			<input type="text" placeholder=userId name="id">
			<br>
			<input type="password" placeHolder=password name="password">
		</div>
			
			<br>
			<p>Don't have an account? <a href="/registers">Creat Your Account</a> it takes less than a minute</p>
			<br>
				<div class="remember-me--forget-password">
				<!-- Angular -->
	<label>
		<input type="checkbox" name="item" checked/>
		<span class="text-checkbox">Remember me</span>
	</label>
			<p>forget password?</p>
		</div>
		
	
			<button class="button-10" role="button">Login</button>
			</form>
	
	
</div>
<!-- partial -->
  
</body>
</html>
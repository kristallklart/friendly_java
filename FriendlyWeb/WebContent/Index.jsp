<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Friendly - Home</title>
	
	<link rel="stylesheet" href="/FriendlyWeb/lib/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="/FriendlyWeb/css/style.css">
</head>

<body>
	<% session.invalidate(); %>
	<%@ include file = "/html/DefaultNavbar.html" %>

	<div class=container>
		<div class="jumbotron">
	    	<div class="container">
		        <div class="row text-center default-bottom-margin default-top-margin">
		          <div class="col-sm-8 col-sm-offset-2">
		            <h1>Welcome to Friendly</h1>
		          </div>
		          <div class="col-sm-2"></div>
		        </div>
		        <div class="row text-center default-bottom-margin default-top-margin">
		          <div class="col-sm-8 col-sm-offset-2">
		            <p class="lead hidden-xs">Something something about Friendly, catchy slogan..</p>
		          </div>
		          <div class="col-sm-2"></div>
		        </div>
		        <form action="/FriendlyWeb/MainServlet" method="post" name="sign-in" id="sign-in" class="form-horizontal">
					<div class="form-group">
					    <div class="col-md-6 col-md-offset-3">
					      <input type="text" class="form-control input-lg" id="username" name="username" placeholder="Username">
					    </div>
				  	</div>
				  	<div class="form-group">
				    	<div class="col-md-6 col-md-offset-3">
				      		<input type="password" class="form-control input-lg" id="password" name="password" placeholder="Password">
				    	</div>
				  	</div>
				  	<div class="form-group">
				    	<div class="col-md-offset-3 col-md-2">
				      		<button type="submit" name="submit" class="btn btn-primary btn-lg">Sign in</button>
				    	</div>
				    	<input name="operation" value="profile" type="hidden">
				  	</div>
					<div class="form-group">
						<div class="col-md-offset-3 col-md-5">
			            	<a class="btn btn-success btn-lg" href="/FriendlyWeb/SignUp.jsp" role="button">Not a member yet? Register here!</a>			
						</div>
					</div>
				</form>
	      	</div>
	    </div>
	 </div>
	 
	<%@ include file = "/html/footer.html" %>
	
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="/FriendlyWeb/lib/bootstrap/js/bootstrap.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/jquery.validate.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.16.0/additional-methods.min.js"></script>
  <script src="/FriendlyWeb/lib/jquery-validator/validation.js"></script>
  <script src="/FriendlyWeb/js/active.js"></script>
  
</body>

</html>
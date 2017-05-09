<%@page import="friendly.ejb.FriendlyUser"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Friendly - About</title>
	
	<link rel="stylesheet" href="/FriendlyWeb/lib/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="/FriendlyWeb/css/style.css">
</head>

<body>
	<% FriendlyUser u = (FriendlyUser) session.getAttribute("user"); %>
 	<% if (u != null) { %>
		<%@ include file = "/html/SignedInNavbar.html" %>		
	<% } else { %>
		<%@ include file = "/html/DefaultNavbar.html" %>
	<% } %>
	
	<div class="container">
		<div class="row">
			<div class="col-xs-12">
				<h1> Friendly </h1>
			</div>		
		</div>
		<div class="row">
			<div class="col-xs-12">
				<p class="lead">
					Friendly is the coolest social platform in the whole universe! 
					It is specifically designed for working people who are on the road and want to meet up with others. 
					Sign up today and use it for free forever! We promise! ;) 
				</p>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-12">
				<h2>Meet the developers</h2>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-12">
				<p class="default-bottom-padding">
					The awesome development team below were the ones who created Friendly for all you people to use. Kudos to them!
				</p>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-12 col-sm-6 col-md-4 col-lg-4">
				<img class="img-responsive img-rounded" src="/FriendlyWeb/assets/img/anna3.jpg">
				<h3>Anna</h3>
				<p> 
					Anna is a HTML wizard and spends most of her free time philosophizing in the garden. 
				</p>
			</div>
			<div class="col-xs-12 col-sm-6 col-md-4 col-lg-4">
				<img class="img-responsive img-rounded" src="/FriendlyWeb/assets/img/ak3.jpg">
				<h3> Ann-Kathrine </h3>
				<p> 
					Also known as AK, Ann-Kathrine is the "Mother of Cats" and has a knack for all things concerning JavaScript.
				</p>
			</div>
			<div class="col-xs-12 col-sm-6 col-md-4 col-lg-4">
				<img class="img-responsive img-rounded" src="/FriendlyWeb/assets/img/kalle3.jpg">
				<h3>Kalle</h3>
				<p>
					The King of Code, or just Kalle as we like to call him, mostly preoccupies himself with computery stuff.
				</p>
			</div>
			<div class="col-xs-12 col-sm-6 col-md-4 col-lg-4">
				<img class="img-responsive img-rounded" src="/FriendlyWeb/assets/img/jossan4.jpg">
				<h3>Josefin</h3>
				<p>
					Josefin is a wild party animal as well as an amazing CSS expert in her own right.
				</p>
			</div>
			<div class="col-xs-12 col-sm-6 col-md-4 col-lg-4">
				<img class="img-responsive img-rounded" src="/FriendlyWeb/assets/img/jakob3.jpg">
				<h3>Jakob</h3>
				<p>
					Jakob has a passion for the endless possibilities of artificial intelligence and for arguing in pointless discussions.
				</p>
			</div>		
		</div>
	</div>

	<%@ include file = "/html/footer.html" %>

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  	<script src="/FriendlyWeb/lib/bootstrap/js/bootstrap.min.js"></script>
  	<script src="/FriendlyWeb/js/active.js"></script>
  	
</body>

</html>
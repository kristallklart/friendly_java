<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="friendly.ejb.FriendlyUser"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@page import="javax.imageio.ImageIO" %>
<%@page import="java.io.ByteArrayInputStream" %>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>	
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Friendly - Profile</title>
	
	<link rel="stylesheet" href="/FriendlyWeb/lib/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/FriendlyWeb/css/style.css">
</head>

<body>
	
	<% FriendlyUser u = (FriendlyUser) session.getAttribute("user"); %>
	<% DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); %>
	<% session = request.getSession(); %>
	
	<%@ include file = "/html/SignedInNavbar.html" %>	
	
	<div class="container">
		<div class="row">	
			<div class="col-sm-4 col-lg-3">
				<div class="profile-info"> <img class="img-responsive img-rounded" src="/FriendlyWeb/assets/img/anna3.jpg" alt="profilepic"></div>
			</div>
			<div class="col-sm-8 col-lg-9">
				<div class="jumbotron" style="padding-top: 5px; padding-bottom: 45px">
					<div class="row">
						<h2 style="padding-left: 13px; padding-bottom: 10px"><%=u.getFirstname() + " " + u.getLastname() %></h2>
					</div>
					<div class="row">
						<div class="col-xs-1"> <p class="lead"><span class="glyphicon glyphicon-briefcase" style="vertical-align: middle" aria-hidden="true"></span></p> </div>
						<div class="col-xs-11">
							<p style="padding-top: 3px">
								<% if (u.getProfession() != null) { %>
									<%=u.getProfession() %>
								<% } else { %>
									No information available yet.
								<% } %>
							</p>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-1"> <p class="lead"><span class="glyphicon glyphicon-equalizer" style="vertical-align: middle" aria-hidden="true"></span></p> </div>
						<div class="col-xs-11">
							<p style="padding-top: 3px"> 
						
								<% if (u.getIndustry() != null) { %>
									<%=u.getIndustry().getIndustry() %>
								<% } else { %>
									No information available yet.
								<% } %>
							</p> 
						</div>
					</div>
					<div class="row">
						<div class="col-xs-1"> <p class="lead"><span class="glyphicon glyphicon-gift" style="vertical-align: middle" aria-hidden="true"></span></p> </div>
						<div class="col-xs-11">
							<p style="padding-top: 3px">
								<%=df.format(u.getBirthdate()) %>
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row default-top-padding">
			<div class="col-sm-12">
				<div class="panel panel-success">
					<div class="panel-heading">
						<h3 class="panel-title">About</h3>
					</div>
					<div class="panel-body">
						<p>			
						<% if (u.getAbout() != null) { %>
						<%=u.getAbout() %>
						<% } else { %>
							No information available yet.
						<% } %>
						</p>
					</div>
				</div>
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
<%@ page import="friendly.ejb.FriendlyUser"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Friendly - Test</title>
	
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
    	<div class="jumbotron">
			<div class="container">
		        <div class="row text-center default-bottom-margin default-top-margin">
		        	<div class="col-sm-8 col-sm-offset-2">
		            	<h2>Test of method in the facade</h2>
		          	</div>
					<div class="row col-sm-8 col-sm-offset-2 text-center default-bottom-margin">
						<form class="form-inline" action="TestServlet" method="get" name="testForm" id="testForm">
							<div class="form-group">
								<select name="suite" id="suite" size="1" class="form-control">
									<option value="friendly.junit.ejb.FacadeBeanTest">Test findByCity</option>
								</select>
							</div>
							<button type="submit" name="submit" class="btn btn-primary">Test Method</button>
						</form>
					</div>
      			</div>
      		</div>
		</div>
	</div>
		
	<%@ include file = "/html/footer.html" %>
		
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  	<script src="/FriendlyWeb/lib/bootstrap/js/bootstrap.min.js"></script>
  	<script src="/FriendlyWeb/js/active.js"></script>
  	
</body>

</html>
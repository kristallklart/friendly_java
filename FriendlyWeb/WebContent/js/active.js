$(document).ready(function() {
	var currurl = window.location.pathname;
	var index = currurl.lastIndexOf("/") + 1;
	var filename = currurl.substr(index);
	
	switch (filename) {
	case "Locations.jsp":
		$("#locations").addClass("active")
		break;
	case "Profile.jsp":
		$("#profile").addClass("active")
		break;
	case "Index.jsp":
		$("#index").addClass("active")
		break;
	case "SignUp.jsp":
		$("#signUp").addClass("active")
		break;
	case "Test.jsp":
		$("#tests").addClass("active")
		break;
	case "About.jsp":
		$("#about").addClass("active")
		break;
	default:
		$("#profile").addClass("active")
		$("#index").addClass("active")
	}
	
});
	

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="myproject.css">
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
<meta name="viewport"content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style type="text/css">

/* .myproject-navbar-header{
	color: red;
	font-size: 77px;
	
	
} */
</style>

</head>
<body>


		<div>
			<div class="myprojectmenu">
			<jsp:include page="project-navbar.jsp"></jsp:include>
			</div>
		
		<div class=" jumbotron text-center">
		<div class="row">
			<div class="col-sm-8"></div>
			<div class="col-sm-4"><jsp:include page="contact-form.jsp"></jsp:include></div>
			
		
		</div>
		</div>
		
		
		
		</div>	







</body>
</html>
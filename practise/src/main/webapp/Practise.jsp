<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>

	<nav class="navbar navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="90" height="30">
			</a>

<a href="index.jsp">Home</a>

</div>
</nav>

<h1>WelCome To practise Details</h1>

			<form action="practise" method="get">
				
			<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name</label>
  <input type="text" class="form-control" name="name"
							id="exampleFormControlInput1" placeholder="Enter name">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput2" class="form-label">Area</label>
  <input type="text" class="form-control" name="area"
							id="exampleFormControlInput2" placeholder="Enter area name">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput3" class="form-label">Street</label>
  <input type="text" class="form-control" name="street"
							id="exampleFormControlInput3" placeholder="Enter street"/>
</div>
		
  <div class="mb-3">
  <label for="exampleFormControlInput4" class="form-label">Floor Number</label>
  <input type="text" class="form-control" name="floorNo"
							id="exampleFormControlInput4" placeholder="Enter floorNo"/>
</div>
<div class="mb-3">
  <label for="exampleFormControlInput5" class="form-label">HomeNo</label>
  <input type="text" class="form-control" name="homeNo"
							id="exampleFormControlInput5" placeholder="Enter homeNo"/>
</div>
  <input type="submit" value="click me" class="btn btn-dark" />
		
			</form>
			
</body>
</html>
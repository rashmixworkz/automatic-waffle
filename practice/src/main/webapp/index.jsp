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

<a href="Student.jsp">Student Details</a>

</div>
</nav>

<h1>WelCome To Udupi Hotel</h1>

			<form action="store" method="get">
				
			<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Hotel Name</label>
  <input type="text" class="form-control" name="hotelName"
							id="exampleFormControlInput1" placeholder="Enter Hotel name">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput2" class="form-label">dish Name</label>
  <input type="text" class="form-control" name="dishName"
							id="exampleFormControlInput2" placeholder="Enter dish name">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput3" class="form-label">Price</label>
  <input type="text" class="form-control" name="price"
							id="exampleFormControlInput3" placeholder="Enter price"/>
</div>
		
  <div class="mb-3">
  <label for="exampleFormControlInput4" class="form-label">Food Type</label>
  <input type="text" class="form-control" name="foodType"
							id="exampleFormControlInput4" placeholder="Enter foodType"/>
</div>
<div class="mb-3">
  <label for="exampleFormControlInput5" class="form-label">TakeAway</label>
  <input type="text" class="form-control" name="takeAway"
							id="exampleFormControlInput5" placeholder="Enter takeAway"/>
</div>
  <input type="submit" value="click me" class="btn btn-dark" />
		
			</form>
			
</body>
</html>
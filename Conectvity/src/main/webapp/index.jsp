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
<a href="BakaryDetails.jsp">BeakaryDetails</a>
</div>
</nav>

<h1>WelCome To Manasa Bekary</h1>

			<form action="details" method="get">
				
			<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Beakary Name</label>
  <input type="text" class="form-control" name="name"
							id="exampleFormControlInput1" placeholder="Enter bakary name">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput2" class="form-label">Owner Name</label>
  <input type="text" class="form-control" name="ownerName"
							id="exampleFormControlInput2" placeholder="Enter owner name">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput3" class="form-label">Owner wife Name</label>
  <input type="text" class="form-control" name="wifeName"
							id="exampleFormControlInput3" placeholder="Enter owner wife name"/>
</div>
		<div class="form-check"><label>Married</label>
		<input type="radio" value="yes" name="marriage"/>Yes
		<input type="radio" value="no" name="marriage"/>No
		</div>
  <div class="mb-3">
  <label for="exampleFormControlInput4" class="form-label">Bakary Famous</label>
  <input type="textarea" class="form-control" name="famous"
							id="exampleFormControlInput4" placeholder="Enter famous"/>
</div>
<div class="mb-3">
  <label for="exampleFormControlInput5" class="form-label">Bakary since</label>
  <input type="text" class="form-control" name="since"
							id="exampleFormControlInput5" placeholder="Enter beakary since"/>
</div>
  <input type="submit" value="click me" class="btn btn-dark" />
		
			</form>
			
</body>
</html>
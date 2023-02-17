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
<a href="BigBasketSuccess.jsp">BigBasketSucces</a>
<a href="index.jsp">Home</a>
</div>
</nav>



<h1>BigBasket Details</h1> <br>

<form action="basket" mathod="get">
<div class="mb-3">

  <label for="exampleFormControlInput1" class="form-label">Name</label>
  <input type="text" class="form-control" name="name"
							id="exampleFormControlInput1" placeholder="Enter name">
</div>

<select class="select" multiple data-mdb-visible-options="3"
				name="item">
 <option value="SELECT">SELECT</option>
  <option value="Juices">Juices</option>
  <option value="Snackes">Snackes</option>
   <option value="Snackes">Chocolates</option>
    <option value="Snackes">Soaps</option>
 </select>
 
 <select class="select" multiple data-mdb-visible-options="3"
				name="area">
 <option value="SELECT">SELECT</option>				
  <option value="Juices">Basvangudi</option>
  <option value="Snackes">RR Nagar</option>
   <option value="Snackes">Rajajinagar</option>
    <option value="Snackes">IndiraNagar</option>
 </select>
 
 <div class="mb-3">
  <label for="exampleFormControlInput2" class="form-label">NoOfEmployes</label>
  <input type="text" class="form-control" name="noOfEmployes"
							id="exampleFormControlInput2" placeholder="Enter name">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput3" class="form-label">email</label>
  <input type="text" class="form-control" name="email"
							id="exampleFormControlInput3" placeholder="Enter name">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput4" class="form-label">Password</label>
  <input type="text" class="form-control" name="password"
							id="exampleFormControlInput4" placeholder="Enter name">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput5" class="form-label">MangerName</label>
  <input type="text" class="form-control" name="mangerName"
							id="exampleFormControlInput5" placeholder="Enter name">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput6" class="form-label">NoOfVarityItems</label>
  <input type="text" class="form-control" name="noOfVarityItems"
							id="exampleFormControlInput6" placeholder="Enter name">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput7" class="form-label">Service</label>
  <input type="text" class="form-control" name="service"
							id="exampleFormControlInput7" placeholder="Enter name">
</div>

 <input type="submit" value="save me" class="btn btn-dark" />

</form>
</body>
</html>

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

<h1>Details of CM</h1>

			<form action="cm" method="post">
				
			<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">ChifeMinister Name</label>
  <input type="text" class="form-control" name="name"
							id="exampleFormControlInput1" placeholder="Enter ChifeMinister name">
</div>

<select class="select" multiple data-mdb-visible-options="3"
				name="party">
  <option value="BJP">BJP</option>
  <option value="CONGRESS">CONGRESS</option>
    <option value="JDS">JDS</option>
      <option value="AAP">AAP</option>
 </select>
 
 <label for="exampleFormControlInput2" class="form-label">State</label>
  <input type="text" class="form-control" name="name"
							id="exampleFormControlInput1" placeholder="Enter state name">
</div>
 
 
<select class="select" multiple data-mdb-visible-options="3"
				name="tenure">
  <option value="1">1</option>
  <option value="2">2</option>
    <option value="3">3</option>
      <option value="4">4</option>
          <option value="5">5</option>
 </select>
		
  <div class="mb-3">
  <label for="exampleFormControlInput3" class="form-label">PORTFOLIO</label>
  <input type="textarea" class="form-control" name="portfolio"
							id="exampleFormControlInput3" placeholder="Enter portfolio"/>
</div>

  <input type="submit" value="click me" class="btn btn-dark" />
		
			</form>
			
</body>
</html>
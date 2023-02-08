<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<!-- <a href="Beach.jsp">Beach</a>  -->
	<h1>Welcome To Casino</h1>
	<form action = "sent" method="get">
		<pre>
	<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name</label>
  <input type="text" class="form-control" name="name"
					id="exampleFormControlInput1" placeholder="Enter casino name">
</div>

<div class="mb-3">
  <label for="exampleFormControlInput2" class="form-label">Cruise</label>
  <input type="text" class="form-control" name="cruise"
					id="exampleFormControlInput2" placeholder="Enter cruise name">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput3" class="form-label">Entry Fee</label>
  <input type="text" class="form-control" name="entryFee"
					id="exampleFormControlInput2" placeholder="Entry Fee">
</div>


<select class="select" multiple data-mdb-visible-options="3"
				name="freeFood">
  <option value="true">true</option>
  <option value="false">false</option>
 </select>
 
 <input type="submit" value="click me" class="btn btn-dark"/>
 </pre>
	</form>
	
	<a href="Beach.jsp" ></a>

</body>
</html>
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

<h1>Valentine data saving</h1>
<c:forEach items="${error}" var="e">
<span style="color: red">${e.message}</span>
</c:forEach>



			<form action="valentine" method="post">
				
			<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name</label>
  <input type="text" class="form-control" name="name"
							id="exampleFormControlInput1" placeholder="Enter name">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput2" class="form-label">Valentine Name</label>
  <input type="text" class="form-control" name="valentineName"
							id="exampleFormControlInput2" placeholder="Enter valentine name">
</div>

<pre>
Places<select 	name="places">
  <option value="SELECT">SELECT</option>
  <c:forEach items="${places}" var="p">
  <option value="${p}">${p}</option>
  </c:forEach>
 </select>
 </pre>
 
 <pre>
 Gifts<select 	name="gifts">
  <option value="SELECT">SELECT</option>
  <c:forEach items="${gifts}" var="g">
  <option value="${g}">${g}</option>
  </c:forEach>
 </select>
 </pre>
 
 <pre>
<input type="submit" value="save me" class="btn btn-dark" />
</pre>	
			</form>
			
</body>
</html>
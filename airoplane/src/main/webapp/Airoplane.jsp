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
				src="data:image/jpeg;base64,
				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"
				alt="" width="90" height="30">
			</a>
<a href="index.jsp">Home</a>
</div>
</nav>



<h1>Welcome To Airoplane Details saving</h1> <br>
<h3 style="color: green">${message}</h3>
<c:forEach items="${error}" var="e">
<p><span style="color: red">${e.message}</span>
</c:forEach>

<form action="airoplane" method="post">
<pre>
Company<input type="text" name="company"/>
Name<input type="text" name="name"/>
Cost<input type="text" name="cost"/>
Type<select type="text" name="type">
<option value="">Select</option>
<c:forEach items="${type}" var="t">
<option value="${t}">${t}</option>
</c:forEach>
</select>

Country<select type="text" name="country">
<option value="">Select</option>
<c:forEach items="${country}" var="c">
<option value="${c}">${c}</option>
</c:forEach>
</select>

<input type="submit" value="Save me" class="btn btn-primary"/>

</pre>

</form>
</body>
</html>

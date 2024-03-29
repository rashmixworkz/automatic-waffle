<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
crossorigin="anonymous">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" 
crossorigin="anonymous"></script>
</head>
<body>

<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"> <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
     alt="" width="90" height="30">
    </a>
<a href="index.jsp">Food Item</a>
</div>
</nav>
<h1>Page to send Food Item</h1>
<form action="send" method="get">

<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Name</label>
  <input type="text" class="form-control" name="name" id="exampleFormControlInput1" placeholder="Enter food item name">
</div>

<div>
<select class="form-select" aria-label="Default select example" name="type">Type
  <option selected> select food type</option>
  <option value="Veg">Veg</option>
  <option value="Nonveg">Nonveg</option>
  <option value="Both">Both</option>
</select>
</div>

<div>
<label for="customRange2" class="form-label">Quantity</label>
<input type="range" class="form-range" min="0" max="10" name="quantity" id="customRange2">
</div>

<div class="mb-3">
  <label for="exampleFormControlInput2" class="form-label">Price</label>
  <input type="text" class="form-control" name="price" id="exampleFormControlInput2" placeholder="Enter food item Price">
</div>

<div>
<input type="submit" value="send" class="btn btn-dark">
</div>

</form>
</body>
</html>
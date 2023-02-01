<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
</head>
<body>
<h1>Send details of favourite person</h1>
<form action="forward" method="post">
<pre>
firstName<input type="text" name="fname"/>
lastName<input type="text" name="lname"/>
gender<input type="radio" name="gen" value="male"/>male
      <input type="radio" name="gen" value="female"/>female
      <input type="radio" name="gen" value="other"/>other
reason<textarea rows="5" cols="10" name="rea"></textarea> 
address<textarea rows="5" cols="10" name="add"></textarea> 
<input type="submit" value="send">
</pre>
</form>    
</body>
</html>
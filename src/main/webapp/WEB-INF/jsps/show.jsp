<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passanger</title>
</head>
<body>
<h1>Airindia Passangers</h1>
<form action="savePass" method="post">

<pre>
        
    fname:<input type="text" name="fname">

   lname:<input type="text" name="lname">
 
    email:<input type="email" name="email">
    
 mobileno:<input type="number" name="mobileno">

departure:<input type="text" name="dep_airport">

  arrival:<input type="text" name="arr_airport">
  
<input type="submit" value="save Passanger data">

</pre>
</form>


</body>
</html>
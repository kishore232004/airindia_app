<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List all Pasanger</title>
</head>
<body bgcolor="yellow">

<h1>list all passanger</h1>
<hr>

<table border=2>
<tr>
<th>fname</th>
<th>lname</th>
<th>email</th>
<th>mobileno</th>
<th>departure Airport</th>
<th>Arrival Airport</th>
<th>Delete</th>
</tr>
<c:forEach var="Passdata" items="${Passdata}">
<tr>
<td>${Passdata.fname}</td>
<td>${Passdata.lname}</td>
<td>${Passdata.email}</td>
<td>${Passdata.mobileno}</td>
<td>${Passdata.dep_airport}</td>
<td>${Passdata.arr_airport}</td>
<td><a href="deletepass?id=${Passdata.id}">delete</a>
</tr>




</c:forEach>

</table>

</body>
</html>
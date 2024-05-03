<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Books</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
<link type="text/css" rel="stylesheet" href="css/add-student-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Update Books</h2>
		</div>
	</div>
	
	<div id="container">
	<!-- <h3>Update Student</h3> -->
	<form action="BooksControllerServlet" method="get">
	<input type="hidden" name="command" value="UPDATE" />
	<input type="hidden" name="studentId" value="${THE_BOOKS.id}" >
	
	<table>
	<tbody>
	<tr> 
	<td><label>First Name:</label></td>
	<td><input type="text" name="Text" value="${THE_BOOKS.text}" required="required"/></td>
	</tr>
	
	<tr> 
	<td><label>First Name:</label></td>
	<td><input type="text" name="Author" value="${THE_BOOKS.author}" required="required"/></td>
	</tr>
	
	<tr> 
	<td><label>First Name:</label></td>
	<td><input type="text" name="Date" value="${THE_BOOKS.date}" required="required"/></td>
	</tr>
	
	<tr> 
	<td><label>First Name:</label></td>
	<td><input type="text" name="Genres" value="${THE_BOOKS.genres}" required="required"/></td>
	</tr>
	
	<tr> 
	<td><label>First Name:</label></td>
	<td><input type="text" name="Characters" value="${THE_BOOKS.characters}" required="required"/></td>
	</tr>
	
	<tr> 
	<td><label>First Name:</label></td>
	<td><input type="text" name="Synopsis" value="${THE_BOOKS.synopsis}" required="required"/></td>
	</tr>
	
	
	<tr>
	<td><input type="submit" value="Update" class="save"></td>
	</tr>
	</tbody>
	
	</table>
	</form>
	<div style="clear:both;"></div>
	<p>
	<a href="BooksControllerServlet">Back To List</a>
	</p>
	</div>
</body>
</html>
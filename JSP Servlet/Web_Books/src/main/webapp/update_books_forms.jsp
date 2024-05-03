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
	<input type="hidden" name="booksId" value="${BOOKS_LIST.id}" >
	
	<table>
	<tbody>
	<tr> 
	<td><label>Title :</label></td>
	<td><input type="text" name="Text" value="${BOOKS_LIST.title}" /></td>
	</tr>
	
	<tr> 
	<td><label>Author :</label></td>
	<td><input type="text" name="Author" value="${BOOKS_LIST.author}" /></td>
	</tr>
	
	<tr> 
	<td><label>Date :</label></td>
	<td><input type="text" name="Date" value="${BOOKS_LIST.date}"/></td>
	</tr>
	
	<tr> 
	<td><label>Genres :</label></td>
	<td><input type="text" name="Genres" value="${BOOKS_LIST.genres}" /></td>
	</tr>
	
	<tr> 
	<td><label>Characters :</label></td>
	<td><input type="text" name="Characters" value="${BOOKS_LIST.characters}" /></td>
	</tr>
	
	<tr> 
	<td><label>Synopsis :</label></td>
	<td><input type="text" name="Synopsis" value="${BOOKS_LIST.synopsis}" /></td>
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
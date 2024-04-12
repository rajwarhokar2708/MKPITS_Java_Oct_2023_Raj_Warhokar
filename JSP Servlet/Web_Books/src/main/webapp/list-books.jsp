<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.mkpits.jdbc.Books_Model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books List</title>
<link type="text/css" rel="stylesheet" href="Css/style.css">
</head>
<%List <Books_Model> theBooks =(List<Books_Model>)request.getAttribute("BOOKS_LIST"); %>
<%-- <%List <Books_Model> theBooks =(List<Books_Model>)request.getAttribute("STUDENT_LIST"); %> --%>
<body>
	<div id="wrapper">
	<div id="header">
	<h2>MKPITS University</h2>
	</div>
	</div>
	
	<div id="container">
	<div id="content">
	<table><tr>
	<th>Id</th>
	<th>Title</th>
	<th>Author</th>
	<th>Date</th>
	<th>genres</th>
	<th>characters</th>
	<th>synopsis</th>
	</tr>
	<c:forEach var="tempStudent" items="${BOOKS_LIST}">

					<tr>
						<td>${tempStudent.id}</td>
						<td>${tempStudent.title}</td>
						<td>${tempStudent.author}</td>
						<td>${tempStudent.date}</td>
						<td>${tempStudent.genres}</td>
						<td>${tempStudent.characters}</td>
						<td>${tempStudent.synopsis}</td>


					</tr>
				</c:forEach>

	</table>
	</div>
	</div>
</body>
</html>
<%@page import="com.mkpits.jdbc1.Student_Model"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="Css/style.css">
</head>
<%List <Student_Model> theStudent =(List<Student_Model>)request.getAttribute("STUDENT_LIST"); %>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>MKPITS University</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<input type="button" value="Add Student"
		onclick="window.location.href='add_student_form.jsp'; return false;"
		class="add-student-button">
			<table border="1">
				<tr>
					<th>ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				<c:forEach var="tempStudent" items="${STUDENT_LIST}">

					<tr>
						<td>${tempStudent.id}</td>
						<td>${tempStudent.firstName}</td>
						<td>${tempStudent.lastName}</td>
						<td>${tempStudent.email}</td>


					</tr>
				</c:forEach>

			</table>
		</div>
	</div>
</body>
</html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.mkpits.model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Student> data=new ArrayList<Student>();
	data.add(new Student("Vinay","Thaware",false));
	data.add(new Student("Khausthub","Anjankar",false));
	data.add(new Student("Sanket","Mohod",false));
	data.add(new Student("Raj","Warhokar",true));
	pageContext.setAttribute("myStudent", data);
	%>
	<c:forEach var="tempStudent" items="${myStudent}" >
	${tempStudent.firstName }
	${tempStudent.lastName }
	${tempStudent.isgoidCustomer }
	<br>
	</c:forEach>
</body>
</html>
<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Your Name is :${param.fName} ${param.lName} <br><br>
	Country :${param.country }<br><br>
	Favourite Language :${param.favlang }<br><br>
	Hobbies :<ul>
		<%
		String[]hobbies=request.getParameterValues("hobbies");
		for(String temp:hobbies){
			out.println("<li>"+temp+"</li>");
		}
		%>	
	</ul>
</body>
</html>
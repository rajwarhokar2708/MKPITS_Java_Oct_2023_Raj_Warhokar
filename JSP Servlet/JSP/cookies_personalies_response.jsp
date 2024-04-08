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
	String favLang1=request.getParameter("favLang");
	Cookie theCookies= new Cookie("myApp.favouriteLang",favLang1);
	theCookies.setMaxAge(60*60*24*365);
	response.addCookie(theCookies);
	 %>
	 Thank You ! Set Your Favourite Language to :  ${param.favLang};
	 <a href="cookies_homepage.jsp"> Home Page</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Training</h3>
	<% 
	String favLang2 ="Java";
	Cookie[] theCookies =request.getCookies();
	if(theCookies != null){
		for(Cookie tempCookie :theCookies){
			if("myApp.favouriteLang".equals(tempCookie.getName())){
				favLang2=tempCookie.getValue();
				break;
			}
		}
	}
			%>
			
			<h4>New Booking For <%= favLang2 %></h4>
			<ul>
			<li>Hello There</li>
			<li>Hello There</li>
			<li>Hello There</li>
			</ul><hr>
			<ul>
			<h4>New Booking For <%= favLang2 %></h4>
			<li>Hello There</li>
			<li>Hello There</li>
			<li>Hello There</li>
			</ul><hr>
			<ul>
			<h4>New Booking For <%= favLang2 %></h4>
			<li>Hello There</li>
			<li>Hello There</li>
			<li>Hello There</li>
			</ul><hr>
			<a href="cookies_personalise_response.html">Personalise This Page</a>
			
</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@page import="com.mkpits.jdbc.Customer_Model"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link type="text/css" rel="stylesheet" href="CSS/login.css">
</head>
<body>
	 <div class="container">
      <h1>Login Form</h1>
      <form action="ControllerServelet" method="post">
       <!-- <input type="hidden" name="command" value="LOGIN" /> -->
       
        <label for="email">Email: </label><br />
        <input type="email" id="email" name="email" /><br /><br />

        <label for="password">Password: </label><br />
        <input type="password" id="password" name="password" /><br /><br />
        
        <a href="#">Forgot Password?</a><br />
        <br />

        <input type="submit" value="Login" /><br>
        
        Not Register ? <a href="registration.jsp">Click Here</a>
        <h1></h1>
      </form>
    <h1>  </h1>
    </div>
</body>
</html>
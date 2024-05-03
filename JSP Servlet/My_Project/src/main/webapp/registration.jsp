<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<link type="text/css" rel="stylesheet" href="CSS/registration.css">
</head>
<body>
	 <div class="container">
      <h1>Registration Form</h1>
      <form action="ControllerServelet" method="get">
      <input type="hidden" name="command" value="ADD" />
      
        <label for="name">Name: </label><br />
        <input type="text" id="name" name="name" /><br /><br />

        <label for="email">Email: </label><br />
        <input type="email" id="email" name="email" required /><br /><br />

        <label for="gender">Gender: </label><br />
        <select id="gender" name="gender">
          <option value="male">Male</option>
          <option value="female">Female</option></select
        ><br /><br />

        <label for="city">City: </label><br />
        <input type="text" id="city" name="city" /><br /><br />

        <label for="mobile_no">Mobile No: </label><br />
        <input type="text" id="mobile_no" name="mobile_no" /><br /><br />

        <label for="password">Password: </label><br />
        <input type="text" id="password" name="password" /><br /><br />

        <label for="re_password">Confirm Password: </label><br />
        <input
          type="password"
          id="re_password"
          name="re_password"
        /><br /><br />

        <input type="submit" value="Submit" />
      </form>
    </div>
</body>
</html>
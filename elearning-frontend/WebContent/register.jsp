<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<h2>Register Here</h2>
<hr>
<form action="register" method="POST">
    <pre>
    User Id   : <input type="number" name="userid"><br>
    Name      : <input type="text" name="name"><br>
    Email	 : <input type="email" name="email"><br>
    Password  : <input type="password" name="password"><br>
    Address   : <input type="text" name="address"><br>
    Phone    : <input type="number" name="phone"><br>
    Upload Image: <input type="text" name="image"><br>
    Date	  : <input type="text" name="date"><br>
                <input type="submit" value="Register">  <input type="reset" value="Reset"><br>
    </pre>
</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrator Login</title>
</head>
<body>
<h2>Administrator Login</h2>
<hr>
<form action="admin" method="POST">
    <pre>
    Administrator Id   : <input type="number" name="adminid"><br>
    Email	 : <input type="email" name="email"><br>
    Password : <input type="password" name="password"><br>
    
                <input type="submit" value="Submit" href="afterloginadm"><br>
    </pre>
</form>
</body>

</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>eLearning Online Portal</title>
<style>
body{
	background-image: radial-gradient(#33B7FF,#5633ff);
	color: white;
	height: 100vh;
}

.heading{
font-size:30px;
margin-top: 50px;
}
.signinbutton{
	margin-left:565px;
	padding:15px;
	font-size:20px;
	color: midnightblue;
	background-color:white;
	border-radius:5px;
	margin-top: 20px;
}
.signinbutton:hover{
	margin-left:565px;
	padding:15px;
	font-size:20px;
	color: midnightblue;
	background-color:cyan;
	border-radius:5px;
	margin-top: 20px;
}
.userbutton{
	margin-left:570px;
	padding:15px;
	font-size:20px;
	color: midnightblue;
	background-color:white;
	border-radius:5px;
	margin-top:50px;
}
.userbutton:hover{
	margin-left:570px;
	padding:15px;
	font-size:20px;
	color: midnightblue;
	background-color:cyan;
	border-radius:5px;
	margin-top:20px;
}
.registerbutton{
	margin-left:540px;
	padding:15px;
	font-size:20px;
	color: midnightblue;
	background-color:white;
	border-radius:5px;
	margin-top:20px;
}
.registerbutton:hover{
	margin-left:540px;
	padding:15px;
	font-size:20px;
	color: midnightblue;
	background-color:cyan;
	border-radius:5px;
	margin-top:40px;
}
</style>
</head>
<body>
<center><p class="heading">Welcome to E Learning Online Portal</p></center>

<br><br><br><a class="registerbutton" href="register.jsp">New User? Sign Up</a><br><br><br><br><br>
<a class="userbutton" href="loginuser.jsp">User Login</a><br><br><br><br><br>
<a class="signinbutton" href="loginadmin.jsp">Admin Login</a><br><br><br><br><br>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Invalid Login credentials</title>
<style>
body{
	background-image: radial-gradient(#33B7FF,#5633ff);
	color: white;
	height: 100vh;
}
.heading{
font-size:40px;
margin-top: 50px;
}
.submitbutton{
	margin-left:580px;
	padding:8px;
	font-size:20px;
	color: midnightblue;
	background-color:lightblue;
	border-radius:5px;
	
}
.submitbutton:hover{
	margin-left:580px;
	padding:8px;
	font-size:20px;
	color: midnightblue;
	background-color:cyan;
	border-radius:5px;
	
}
.inputfld{
	margin-left: 430px;
	padding: 5px;
	broder-radius:10px;
	font-size:12px;
	width:30%;
}
.inputfld1{
	margin-left: 438px;
	padding: 5px;
	broder-radius:10px;
	font-size:12px;
	width:30%;
}
.inputfld2{
	margin-left: 438px;
	padding: 5px;
	broder-radius:10px;
	font-size:12px;
	width:30%;
}
.txtfld{
	font-size:20px;
	margin-left:440px;
}
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #111;
}

.active {
  background-color: #04AA6D;
}
.txt{
	font-size:25px;
}
</style>
</head>
<body>
<center><p class="txt">The credentials you entered do not exist.</p></center>
<center><p class="txt">Please Register from the below button.</p></center><br><br><br>

<a class="submitbutton" href="register.jsp">Register</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
<style>
body{
	background-image: radial-gradient(#33B7FF,#5633ff);
	color: white;
	height: 100vh;
}
.heading{
font-size:25px;
margin-top: 50px;
}
.submitbutton{
	margin-left:460px;
	padding:8px;
	font-size:20px;
	color: midnightblue;
	background-color:lightblue;
	border-radius:5px;
	margin-top: 20px;
}
.submitbutton:hover{
	margin-left:460px;
	padding:8px;
	font-size:20px;
	color: midnightblue;
	background-color:cyan;
	border-radius:5px;
	margin-top: 20px;
}
.inputfld{
	margin-left: 430px;
	padding: 5px;
	broder-radius:10px;
	font-size:12px;
	width:30%;
}
.inputfld1{
	margin-left: 420px;
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
  width:100%;
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
  background-color: #33A1FF;
  color: black;
}
</style>
</head>
<body>
<ul>
  <li><a class="active" href="afterloginadm.jsp">Home</a></li>
  <li><a href="admin.jsp">Admin</a>
  <li><a href="course.jsp">Course</a></li>
  
  <li><a href="contactdisplay.jsp">Contact</a></li>
  <li><a href="userdisplay.jsp">User</a></li>
  <li><a href="feedbackdisplay.jsp">Feedback</a></li>
  <li><a href="index.jsp" style="margin-left:700px;">Logout</a></li>
</ul>

<center><p class="heading">Welcome Admin!!</p></center>
<center><p class="heading">For Updating and Viewing your details check Admin Tab</p></center>
<center><p class="heading">For Updating Course check out Course Tab</p></center>
<center><p class="heading">For Updating a Contact check out Contact Tab</p></center>
<center><p class="heading">For Updating a User check out User Tab</p></center>
<center><p class="heading">For Updating a Feedback that has been worked upon check out Feedback Tab</p></center>
</body>
</html>
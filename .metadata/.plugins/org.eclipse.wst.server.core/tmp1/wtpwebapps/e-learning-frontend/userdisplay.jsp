<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
           <%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Admin Page</title>
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
	margin-left:380px;
	padding:8px;
	font-size:20px;
	color: midnightblue;
	background-color:lightblue;
	border-radius:5px;
	margin-top: 20px;
}
.submitbutton:hover{
	margin-left:380px;
	padding:8px;
	font-size:20px;
	color: midnightblue;
	background-color:cyan;
	border-radius:5px;
	margin-top: 20px;
}
.submitbutton1{
	margin-left:450px;
	padding:8px;
	font-size:20px;
	color: midnightblue;
	background-color:lightblue;
	border-radius:5px;
	margin-top: 20px;
}
.submitbutton1:hover{
	margin-left:450px;
	padding:8px;
	font-size:20px;
	color: midnightblue;
	background-color:cyan;
	border-radius:5px;
	margin-top: 20px;
}
.deletebutton{
	margin-left:500px;
	padding:8px;
	font-size:20px;
	color: midnightblue;
	background-color:lightblue;
	border-radius:5px;
	margin-top: 20px;
}
.deletebutton:hover{
	margin-left:500px;
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
.tableedit{
	margin-left:250px;
	border-radius:5px;
	background-color:white;
}
.resetbutton{
	margin-left:30px;
	padding:8px;
	font-size:20px;
	color: midnightblue;
	background-color:lightblue;
	border-radius:5px;
	margin-top: 20px;
}
.resetbutton:hover{
	margin-left:30px;
	padding:8px;
	font-size:20px;
	color: midnightblue;
	background-color:cyan;
	border-radius:5px;
	margin-top: 20px;
}
</style>
</head>
<body>
<ul>
  <li><a href="afterloginadm.jsp">Home</a></li>
  <li><a href="admin.jsp">Admin</a>
  <li><a href="course.jsp">Course</a></li>

  <li><a href="contactdisplay.jsp">Contact</a></li>
  <li><a class="active"  href="userdisplay.jsp">User</a></li>
  <li><a href="feedbackdisplay.jsp">Feedback</a></li>
  <li><a href="index.jsp" style="margin-left:700px;">Logout</a></li>
</ul>
<center><p class="heading">User Registration</p></center>
<form action="register" method="POST">
    <pre>
    <p class="txtfld">User ID</p> <input class="inputfld1" type="number" name="userid">
    <p class="txtfld">Name</p> <input class="inputfld1" type="text" name="name">
    <p class="txtfld">Email ID</p><input class="inputfld" type="email" name="email">
   <p class="txtfld">Password</p><input class="inputfld" type="password" name="password">
    <p class="txtfld">Address</p><input class="inputfld" type="text" name="address">
    <p class="txtfld">Phone Number</p><input class="inputfld" type="number" name="phone">
    <p class="txtfld">Image</p><input class="inputfld" type="text" name="image">
    <p class="txtfld">Present Date</p><input class="inputfld" type="text" name="date"><br>
                <input class="submitbutton" type="submit" value="Register">  <input class="resetbutton" type="reset" value="Reset"><br>
    </pre>
</form>
<center><p class="heading">Update Users</p></center>
<form action="userupdate" method="POST">
    <pre>
    <p class="txtfld">User ID</p> <input class="inputfld1" type="number" name="userid">
    <p class="txtfld">Name</p> <input class="inputfld1" type="text" name="name">
    <p class="txtfld">Email ID</p><input class="inputfld" type="email" name="email">
   <p class="txtfld">Password</p><input class="inputfld" type="password" name="password">
    <p class="txtfld">Address</p><input class="inputfld" type="text" name="address">
    <p class="txtfld">Phone Number</p><input class="inputfld" type="number" name="phone">
    <p class="txtfld">Image</p><input class="inputfld" type="text" name="image">
    <p class="txtfld">Present Date</p><input class="inputfld" type="text" name="date"><br>
                <input class="submitbutton1" type="submit" value="Update User"><br>
    </pre>
</form>
<center><p class="heading">Delete User</p></center> 
<form action="userdelete" method="POST">
    <pre>
                
               
     <p class="txtfld">User ID</p><input class="inputfld" type="number" name="userid">
     	<input class="deletebutton" type="submit" value="Delete User"><br>
                
     
    </pre>
</form>
<center><p class="heading">User Table</p></center> 
<%
try {
/* Create string of connection url within specified format with machine
name, port number and database name. Here machine name id localhost and 
database name is student. */
String connectionURL = "jdbc:mysql://localhost:3306/elearningschema";
// declare a connection by using Connection interface
Connection connection = null;
/* declare object of Statement interface that is used for executing sql 
statements. */
Statement statement = null;
// declare a resultset that uses as a table for output data from tha table.
ResultSet rs = null;
// Load JBBC driver "com.mysql.jdbc.Driver"
Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
/* Create a connection by using getConnection() method that takes parameters 
of string type connection url, user name and password to connect to database.*/
connection = DriverManager.getConnection(connectionURL, "root", "root");
/* createStatement() is used for create statement object that is used for 
sending sql statements to the specified database. */
statement = connection.createStatement();
// sql query to retrieve values from the secified table.
String QueryString = "SELECT * from user1";
rs = statement.executeQuery(QueryString);
%>
<TABLE class="tableedit" cellpadding="10" style=" color:midnightblue;">
<TR>
<TD>User ID</TD>
<TD>Name</TD>
<TD>Phone</TD>
<TD>Email</TD>
<TD>Address</TD>
<TD>Date</TD>
<TD>Password</TD>
<TD>Photo</TD>
</TR>
<%
while (rs.next()) {
%>
<TR>
<TD><%=rs.getInt(1)%></TD>
<TD><%=rs.getString(2)%></TD>
<TD><%=rs.getLong(3)%></TD>
<TD><%=rs.getString(4)%></TD>
<TD><%=rs.getString(5)%></TD>
<TD><%=rs.getString(6)%></TD>
<TD><%=rs.getString(7)%></TD>
<TD><%=rs.getString(8)%></TD>
</TR>
<% } %>
<%
// close all the connections.
rs.close();
statement.close();
connection.close();
} catch (Exception ex) {
%>
</font>
<font size="+3" color="red"></b>
<%
out.println("Unable to connect to database.");
}
%>
</TABLE><TABLE>
<TR>
<TD><FORM ACTION="userdisplay.jsp" method="get" >
<button class="deletebutton" type="refresh">Refresh</button></TD>
</TR>
</TABLE>
</font>
</body>
</html>
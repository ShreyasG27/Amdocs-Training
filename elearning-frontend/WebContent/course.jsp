<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course Page</title>
</head>
<body>
<h2>Place Course Here</h2>
<hr>
<form action="course" method="POST">
    <pre>
    Course Id   : <input type="number" name="courseid"><br>
    Course Name      : <input type="text" name="coursename"><br>
    Course resources	 : <input type="text" name="courseres"><br>
    Course description : <input type="text" name="coursedesc"><br>
    Course Fees: <input type="number" name="course_fees"><br>
    
                <input type="submit" value="Submit"><br>
    </pre>
</form>
</body>
</html>
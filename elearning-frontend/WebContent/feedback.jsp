<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Feedback Page</title>
</head>
<body>
<h2>Place Feedback Here</h2>
<hr>
<form action="feedback" method="POST">
    <pre>
    User Id   : <input type="number" name="userid"><br>
    Name      : <input type="text" name="name"><br>
    Email	 : <input type="email" name="email"><br>
    Feedback  : <input type="text" name="feedbackmsg"><br>
    Feedback Id: <input type="number" name="fid"><br>
    
                <input type="submit" value="Submit"><br>
    </pre>
</form>
</body>
</html>
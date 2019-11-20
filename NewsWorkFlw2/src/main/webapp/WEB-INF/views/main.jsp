<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<div class="main"></div>

<!-- Changed location of the div ending tag, was giving me errors when trying to run that stemmed from here -->


<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/main.css">
<title>RSS Feed Main Page</title>
</head>

<!-- Changed Location of </head> to end the error happening with <h1> -->
<h1>NewsWorkFlw</h1>


<body>

<form action=/rssFeed>
<h3>News Type: </h3>
<select name="newsType">
<option value="blank"></option>
<option value="company">Company</option>
<option value="career">Career</option>
<option value="events">Events</option>
</select>
<br>
<br>

<!-- Changed the </br> tags to <br>  they don't need the / -->


<button type="submit">Show Me News</button>
</form>
</body>

</html>
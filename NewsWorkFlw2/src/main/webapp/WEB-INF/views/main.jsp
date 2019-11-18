<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<div class="main">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/main.css">
<title>RSS Feed Main Page</title>
<h1>NewsWorkFlw</h1>
</head>
<body>
<form action=/rssFeed>
<h3>News Type: </h3>
<select name="newsType">
<option value="blank"></option>
<option value="company">Company</option>
<option value="career">Career</option>
<option value="events">Events</option>
</select>
</br>
</br>
<button type="submit">Show Me News</button>
</form>
</body>
</div>
</html>
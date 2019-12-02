<html>
<head>
<link href='https://fonts.googleapis.com/css?family=Armata' rel='stylesheet'>
<meta charset="ISO-8859-1">
</head>
<title>RSS Feed Home</title>
<body style=
"text-align:center; 
margin-top: 5%; 
font-family: 'Armata'">
<div class="main" style=
"background-color: #d9d9d9; 
margin: 0 35%; 
border-radius: 25px; 
padding: 2vmin; 
box-shadow: 0px 0px 10px 5px 0066cc; 
overflow:auto; 
padding-top: 20px">
<header style= "padding-top: 20px">
<h1 style="font-weight: bold">NewsWork<span style="color: 0066cc">Flw</span></h1>
</header>
<form action="/NewsWorkFlw/rssFeed" style="padding-top: 5px">
<h3>News Type: </h3>
<select name="action" style=
"font-family: 'Armata'; 
padding: 10px">
<option value="company">Company</option>
<option value="career">Career</option>
<option value="events">Events</option>
</select>
<br/>
<br/>
<div style="padding-top: 10px">
<button type="submit" style=
"border-radius: 15px; 
box-shadow: 0px 0px 5px 3px #0066cc; 
font-family: 'Armata'; 
text-decoration: none; 
border: none; 
padding: 15px; 
font-weight: bold; 
background-color: white; 
cursor: pointer">Show Me News</button>
</div>
</form>
</div>
</body>
</html>
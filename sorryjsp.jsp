<%-- 
    Document   : sorryjsp
    Created on : 27.01.2018, 20:46:09
    Author     : Nurkhan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	<title>TODO supply a title</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <h1>Sorry, you wrote wrong id or password!</h1>
    </head>
    <body>
	<form action="LoginServlet" method="POST">
	<div>
	    <div>
		<p><input type="text" placeholder="ID" name="login"></p>
		<p><input type="password" placeholder="password" name="password"></p>		
		<input type="submit" name="Login">
	    </div>
	</div>
	</form>
    </body>
</html>

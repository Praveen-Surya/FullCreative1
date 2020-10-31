<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<%
		String UserName = request.getParameter("UserName");
	response.getWriter().print(UserName + "!!! Hello World Welcomes You");
	response.setHeader("cache-control", "no-cache");
	response.setHeader("cache-control", "no-store");
	%>
	<br>
	<form action="LogOut">
		<input type="submit" value="Log Out">
	</form>
</body>
</html>
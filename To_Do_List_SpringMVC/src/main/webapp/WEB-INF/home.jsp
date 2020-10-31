<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Welcome!! To_Do_List</h1>

	<%
		response.setHeader("cache-control", "no-cache");
	response.setHeader("cache-control", "no-store");
	%>


	<form action="CreateAList" method="get">
		<table>
			<tr>
				<td></td>
				<td><input type="submit" value="Create"></td>
			</tr>
		</table>
	</form>
	<br>


	<form action="FetchAList" method="post">
		<table>
			<tr>
				<td></td>
				<td><input type="submit" value="Fetch"></td>
			</tr>
		</table>
	</form>
	<br>


	<form action="ModifyAList" method="get">
		<table>
			<tr>
				<td></td>
				<td><input type="submit" value="Modify"></td>
			</tr>
		</table>
	</form>
	<br>


	<form action="LogOut" method="get">
		<table>
			<tr>
				<td></td>
				<td><input type="submit" value="LogOut"></td>
			</tr>
		</table>
	</form>



</body>
</html>
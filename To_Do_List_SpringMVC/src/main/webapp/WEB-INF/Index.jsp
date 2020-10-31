<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Page</h1>

	<form action="Login" method="post">
		<table>
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="UserName"
					placeholder="Enter UserName" ></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="Password"
					placeholder="Enter Password" ></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
	<br><br>
	<form action="CreateAnAccount" method="get">
		<table>
			<tr>
				<td></td>
				<td><input type="submit" value="CreateAnAccount" ></td>
			</tr>
		</table>
	</form>
	
</body>
</html>
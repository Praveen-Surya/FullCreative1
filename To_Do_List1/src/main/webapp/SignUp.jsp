<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up Page</title>
<script type="text/javascript">
	function checkform() {
		var f = document.forms["myForm"].elements;
		var cansubmit = true;

		for (var i = 0; i < f.length; i++) {
			if (f[i].value.length == 0)
				cansubmit = false;
		}

		if (cansubmit) {
			document.getElementById('submitId').disabled = false;
		} else {
			document.getElementById('submitId').disabled = 'disabled';
		}
	}
</script>
</head>
<body>
	<h1>Sign Up</h1>
	<form name="myForm" action="/CreateAnAccount" method="post">
		<table>
			<tr>
				<td>UserName:</td>
				<td><input type="text" id="UserNameId" name="UserName"
					placeholder="Enter UserName" onKeyup="checkform()"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" id="PasswordId" name="Password"
					placeholder="Enter Password" onKeyup="checkform()"></td>
			</tr>
			<tr>
				<td>Email_Id:</td>
				<td><input type="text" name="EmailId" id="EmailId"
					placeholder="Enter Email_Id" onKeyup="checkform()"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Create" id="submitId"
					disabled="disabled"></td>
			</tr>
		</table>
	</form>
</body>
</html>
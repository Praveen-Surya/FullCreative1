<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/Home" method="post">
		<table>
			<tr>

				<td>Name:</td>
				<td><input type="text" name="Name"
					value="<%=request.getParameter("Name")%>"></td>

				<td>Department:</td>
				<td><input type="text" name="Department"
					value="<%=request.getParameter("Department")%>"></td>

				<td>PhoneNumber:</td>
				<td><input type="text" name="PhoneNumber"
					value="<%=request.getParameter("PhoneNumber")%>"></td>

				<td>EmailId:</td>
				<td><input type="text" name="EmailId"
					value="<%=request.getParameter("EmailId")%>"></td>

				<td><input type="hidden" name="EmpId"
					value="<%=request.getParameter("EmpId")%>"></td>

				<td><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form>

</body>
</html>
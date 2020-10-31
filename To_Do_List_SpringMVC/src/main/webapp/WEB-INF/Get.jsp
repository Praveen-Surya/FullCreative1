<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>
<%@page import="javax.servlet.RequestDispatcher"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display A List</title>
</head>
<body>

	<h1>Available List</h1>



	<c:forEach items="${TITLE}" var="Todo">
	${Todo.content} <br>
	</c:forEach>

	<form action="Home" method="get">
		<table>
			<tr>
				<td></td>
				<td><input type="submit" value="Home"></td>
			</tr>
		</table>
	</form>

</body>
</html>
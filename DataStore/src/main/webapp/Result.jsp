<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.*"%>
<%@ page import="org.full.one.Home"%>
<%@ page import="com.google.appengine.api.datastore.*"%>
<%@page import="javax.servlet.http.HttpServlet"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>
<%@page import="javax.servlet.RequestDispatcher"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Details</h1>
	<br>

	<%
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();

	Query q = new Query("Employee");
	PreparedQuery pq = ds.prepare(q);
	for (Entity u1 : pq.asIterable()) {

		String name = u1.getProperty("Name").toString();
		String department = u1.getProperty("Department").toString();
		String emailId = u1.getProperty("EmailId").toString();
	%>

	<table>
		<tr>
			<td>Name:</td>
			<td><%=name%></td>
			<td>Department:</td>
			<td><%=department%></td>
			<td>EmailId:</td>
			<td><%=emailId%></td>
		</tr>
	</table>
	<form action="/Home" method="get">
		<table>
			<tr>
				<td><input type="hidden" name="id"
					value="<%=u1.getProperty("EmpId").toString()%>"></td>
				<td><input type="submit" value="Delete"></td>
			</tr>
		</table>
	</form>


	<form action="Update.jsp">

		<table>
			<tr>

				<td><input type="hidden" name="Name"
					value="<%=u1.getProperty("Name").toString()%>"></td>

				<td><input type="hidden" name="Department"
					value="<%=u1.getProperty("Department").toString()%>"></td>

				<td><input type="hidden" name="PhoneNumber"
					value="<%=u1.getProperty("PhoneNumber").toString()%>"></td>

				<td><input type="hidden" name="EmailId"
					value="<%=u1.getProperty("EmailId").toString()%>"></td>

				<td><input type="hidden" name="EmpId"
					value="<%=u1.getProperty("EmpId").toString()%>"></td>

				<td><input type="submit" value="Update"></td>
			</tr>
		</table>

	</form>



	<%
		}
	%>




	<table>
		<tr>
			<td><a href="index.html">Home</a></td>
		</tr>
	</table>
</body>
</html>
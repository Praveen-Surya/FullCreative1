<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.*"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@ page import="org.full.controller.*"%>
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

	<%
		response.setHeader("cache-control", "no-cache");
	response.setHeader("cache-control", "no-store");
	%>

	<form name="myForm" action="Create" method="post">
		<table>
			<tr>
				<td>FirstName:</td>
				<td><input type="text" id="FirstNameId" name="FirstName"
					placeholder="Enter FirstName" onKeyup="checkform()"></td>
			</tr>
			<tr>
				<td>LastName:</td>
				<td><input type="text" id="LastNameId" name="LastName"
					placeholder="Enter LastName" onKeyup="checkform()"></td>
			</tr>
			<tr>
				<td>PhoneNumber:</td>
				<td><input type="text" id=PhoneNumberId name="PhoneNumber"
					placeholder="Enter PhoneNumber" onKeyup="checkform()"></td>
			</tr>
			<tr>
				<td>EmailId:</td>
				<td><input type="text" id=EmailId name="EmailId"
					placeholder="Enter EmailId" onKeyup="checkform()"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" id="submitId" value="Add"
					disabled="disabled"></td>
			</tr>
		</table>
	</form>
	<br>
	<a href="Index.html">LogOut</a>
	<br>
	<h3>Contact Details</h3>
	<br>

	<%
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
	//HttpSession session = request.getSession();

	Query q = new Query("Contact");
	PreparedQuery pq = ds.prepare(q);
	for (Entity u1 : pq.asIterable()) {
		if (u1.getProperty("UniqueId").toString().equals(session.getAttribute("User1").toString())) {

			String firstName = u1.getProperty("FirstName").toString();
			String lastName = u1.getProperty("LastName").toString();
			String phoneNumber = u1.getProperty("PhoneNumber").toString();
			String emailId = u1.getProperty("EmailId").toString();
	%>

	<table>
		<tr>
			<td>FirstName:</td>
			<td><input type="text" name="FirstName" value="<%=firstName%>"></td>
			<td>LastName:</td>
			<td><input type="text" name="LastName" value="<%=lastName%>"></td>
			<td>PhoneNumber:</td>
			<td><input type="text" name="PhoneNumber"
				value="<%=phoneNumber%>"></td>
			<td>EmailId:</td>
			<td><input type="text" name="EmailId" value="<%=emailId%>"></td>
		</tr>
	</table>
	<form action="Create" method="get">
		<table>
			<tr>
				<td><input type="hidden" name="id"
					value="<%=u1.getProperty("ContactId").toString()%>"></td>
				<td><input type="submit" value="Delete"></td>
			</tr>
		</table>
	</form>


	<form action="Update" method="post">

		<table>
			<tr>
				<td>FirstName:</td>
				<td><input type="text" name="first"
					value="<%=u1.getProperty("FirstName").toString()%>"></td>
				<td>LastName:</td>
				<td><input type="text" name="second"
					value="<%=u1.getProperty("LastName").toString()%>"></td>
				<td>PhoneNumber:</td>
				<td><input type="text" name="phone"
					value="<%=u1.getProperty("PhoneNumber").toString()%>"></td>
				<td>EmailId:</td>
				<td><input type="text" name="email"
					value="<%=u1.getProperty("EmailId").toString()%>"></td>
				<td><input type="hidden" name="id"
					value="<%=u1.getProperty("ContactId").toString()%>"></td>
				<td><input type="submit" value="Update"></td>
			</tr>
		</table>

	</form>



	<%
		}
	}
	%>

</body>
</html>
package org.full.one;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

@WebServlet("/Home")
public class Home extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String name = request.getParameter("Name");
		String department = request.getParameter("Department");
		String phoneNumber = request.getParameter("PhoneNumber");
		String emailId = request.getParameter("EmailId");
		String empId = request.getParameter("EmpId");

		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();

		Entity e = new Entity("Employee", empId);
		e.setProperty("Name", name);
		e.setProperty("Department", department);
		e.setProperty("PhoneNumber", phoneNumber);
		e.setProperty("EmailId", emailId);
		e.setProperty("EmpId", empId);
		ds.put(e);

		request.setAttribute("LIST", ds);
		RequestDispatcher rd = request.getRequestDispatcher("/Result.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String id = request.getParameter("id");

		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();

		Query q = new Query("Employee");
		PreparedQuery pq = ds.prepare(q);
		for (Entity u1 : pq.asIterable()) {

			if (id.equals(u1.getProperty("EmpId").toString())) {
				Key key = KeyFactory.createKey("Employee", id);
				ds.delete(key);
				u1.removeProperty("EmpId");
			}
		}

		request.setAttribute("LIST", ds);
		RequestDispatcher rd = request.getRequestDispatcher("/Result.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

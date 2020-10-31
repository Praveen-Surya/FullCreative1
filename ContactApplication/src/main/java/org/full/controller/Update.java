package org.full.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

@Controller
public class Update {

	ModelAndView mv = new ModelAndView();

	@RequestMapping(value = "/Update", method = RequestMethod.POST)
	public ModelAndView add1(HttpServletRequest request, HttpServletResponse response) {

		String firstName = request.getParameter("first");
		String lastName = request.getParameter("second");
		String phoneNumber = request.getParameter("phone");
		String emailId = request.getParameter("email");
		String id = request.getParameter("id");

		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();

		Query q = new Query("Contact");
		PreparedQuery pq = ds.prepare(q);
		for (Entity u1 : pq.asIterable()) {

			if (id.equals(u1.getProperty("ContactId").toString())) {

				HttpSession session = request.getSession();
				Entity e = new Entity("Contact", id);
				e.setProperty("UniqueId", session.getAttribute("User1").toString());
				e.setProperty("ContactId", id);
				e.setProperty("FirstName", firstName);
				e.setProperty("LastName", lastName);
				e.setProperty("PhoneNumber", phoneNumber);
				e.setProperty("EmailId", emailId);
				ds.put(e);
			}
		}

		mv.setViewName("Home");
		return mv;

	}
}

package org.full.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;

@Controller
public class Create {

	ModelAndView mv = new ModelAndView();

	
	@RequestMapping(value = "/Create", method = RequestMethod.POST,produces = "application/json; charset=UTF-8")
    @ResponseBody
	public ModelAndView add1(HttpServletRequest request, HttpServletResponse response) {

		String firstName = request.getParameter("FirstName");
		String lastName = request.getParameter("LastName");
		String phoneNumber = request.getParameter("PhoneNumber");
		String emailId = request.getParameter("EmailId");

		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();

		HttpSession session = request.getSession();

		UUID uuid = UUID.randomUUID();
		String uuidNumber = uuid.toString();

		Entity e = new Entity("Contact", uuidNumber);
		e.setProperty("UniqueId", session.getAttribute("User1").toString());
		e.setProperty("ContactId", uuidNumber);
		e.setProperty("FirstName", firstName);
		e.setProperty("LastName", lastName);
		e.setProperty("PhoneNumber", phoneNumber);
		e.setProperty("EmailId", emailId);
		ds.put(e);
		mv.setViewName("Home");
		return mv;

	}

	@RequestMapping(value = "/Create", method = RequestMethod.GET)
	public ModelAndView add11(HttpServletRequest request, HttpServletResponse response) {

		String id = request.getParameter("id");

		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();

		Query q = new Query("Contact");
		PreparedQuery pq = ds.prepare(q);
		for (Entity u1 : pq.asIterable()) {

			if (id.equals(u1.getProperty("ContactId").toString())) {
				Key key = KeyFactory.createKey("Contact", id);
				ds.delete(key);
			}
		}

		mv.setViewName("Home");
		return mv;

	}
}
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
public class Login {
	ModelAndView mv = new ModelAndView();

	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {

		String userName = request.getParameter("UserName");
		String password = request.getParameter("Password");

		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();

		Query q = new Query("User");
		PreparedQuery pq = ds.prepare(q);
		for (Entity u1 : pq.asIterable()) {

			if (userName.equals(u1.getProperty("UserName").toString())
					&& password.equals(u1.getProperty("Password").toString())) {
				HttpSession session = request.getSession();
				session.setMaxInactiveInterval(1800);
				session.setAttribute("User1", u1.getProperty("UserId").toString());
				mv.setViewName("Home");
				return mv;
			}
		}

		mv.setViewName("Error");
		return mv;
	}
}

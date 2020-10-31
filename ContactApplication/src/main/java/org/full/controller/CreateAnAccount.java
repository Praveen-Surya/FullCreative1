package org.full.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@Controller
public class CreateAnAccount {

	ModelAndView mv = new ModelAndView();

	@RequestMapping(value = "/CreateAnAccount", method = RequestMethod.GET)
	public ModelAndView add() {
		mv.setViewName("SignUp");
		return mv;
	}

	@RequestMapping(value = "/CreateAnAccount", method = RequestMethod.POST)
	public ModelAndView add1(HttpServletRequest request, HttpServletResponse response) {

		String userName = request.getParameter("UserName");
		String password = request.getParameter("Password");
		String emailId = request.getParameter("EmailId");

		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();

		UUID uuid = UUID.randomUUID();
		String uuidNumber = uuid.toString();

		Entity e = new Entity("User", uuidNumber);
		e.setProperty("UserName", userName);
		e.setProperty("Password", password);
		e.setProperty("EmailId", emailId);
		e.setProperty("UserId", uuidNumber);
		ds.put(e);
		mv.setViewName("Index");
		return mv;

	}
}
package org.full.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.full.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CreateAnAccount {

	ModelAndView mv = new ModelAndView();

	@RequestMapping(value = "/CreateAnAccount", method = RequestMethod.GET)
	public ModelAndView add() {
		mv.setViewName("SignUp");
		return mv;
	}

	
//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws IOException, ServletException {

//		RequestDispatcher rd = request.getRequestDispatcher("/SignUp.jsp");
//		rd.forward(request, response);
//	}

	
	
	@RequestMapping(value = "/CreateAnAccount", method = RequestMethod.POST)
	public ModelAndView add1(HttpServletRequest request, HttpServletResponse response) {
	
	
//	@Override
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws IOException, ServletException {

		String userName = request.getParameter("UserName");
		String password = request.getParameter("Password");
		String emailId = request.getParameter("EmailId");

		CreateAnAccountObject createAnAccountObject = CreateAnAccountObject.getInstance();
		List<UserDetails> userDetails = CreateAnAccountObject.userDetails;

		userDetails.stream().forEach(user -> {

			if (userName.equals(user.getUserName()) || emailId.equals(user.getEmailId())) {
				RequestDispatcher rd = request.getRequestDispatcher("UserAlreadyExist.jsp");
				try {
					rd.forward(request, response);
				} catch (ServletException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		UserDetails userDetails1 = context.getBean(UserDetails.class);
		userDetails1.setUserName(userName);
		userDetails1.setPassword(password);
		userDetails1.setEmailId(emailId);
		
//		UserDetails ref = new UserDetails();
//		ref.setUserName(userName);
//		ref.setPassword(password);
//		ref.setEmailId(emailId);

		CreateAnAccountObject.addUserDetails(userDetails1);

//		RequestDispatcher rd1 = request.getRequestDispatcher("/Login.html");
//		rd1.forward(request, response);
		mv.setViewName("Index");
		return mv;

	}

}

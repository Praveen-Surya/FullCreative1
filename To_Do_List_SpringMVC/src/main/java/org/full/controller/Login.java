package org.full.controller;

import org.full.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Login {

	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public ModelAndView add(@RequestParam("UserName") String userName, @RequestParam("Password") String password) {

//	@Override
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws IOException, ServletException {
//
//		String userName = request.getParameter("UserName");
//		String password = request.getParameter("Password");

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Authentication authentication = context.getBean(Authentication.class);
		boolean result = authentication.verifyLoginUser(userName, password);

//		Authentication authentication = new Authentication();
//		boolean result = authentication.verifyLoginUser(userName, password);

//		List<UserDetails> userDetails = CreateAnAccountObject.userDetails;
//		userDetails.stream().forEach(user -> {
//
//			if (userName.equals(user.getUserName())) {
//				String emailId = user.getEmailId();
//				HttpSession session = request.getSession();
//				session.setMaxInactiveInterval(1800);
//				session.setAttribute("User", emailId);
//			}
//		});

		ModelAndView mv = new ModelAndView();
		if (result) {

			mv.setViewName("home");

//			RequestDispatcher rd = request.getRequestDispatcher("/Index.jsp");
//			rd.forward(request, response);

		} else {
			mv.setViewName("Error");
//			RequestDispatcher rd = request.getRequestDispatcher("/Error.jsp");
//			rd.forward(request, response);
		}
		return mv;
	}
}

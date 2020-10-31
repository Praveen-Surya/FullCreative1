package org.full.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FetchAList{
	
	ModelAndView mv = new ModelAndView();
	
	
	@RequestMapping(value = "/FetchAList", method = RequestMethod.POST)
	public ModelAndView add2(HttpServletRequest request, HttpServletResponse response) {


//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws IOException, ServletException {

		HttpSession session = request.getSession();
		String emailId = (String) session.getAttribute("User");
		UserTodo userTodo = UserTodo.getInstance();

		
		if (UserTodo.todo1.get(emailId)==null) {
			
			mv.setViewName("Error1");

			
//			RequestDispatcher rd = request.getRequestDispatcher("/Error1.jsp");
//			rd.forward(request, response);
		} else {
			request.setAttribute("TITLE", UserTodo.todo1.get(emailId));
			mv.setViewName("Get");
//			RequestDispatcher rd = request.getRequestDispatcher("/Get.jsp");
//			rd.forward(request, response);
		}
		return mv;
	}
}

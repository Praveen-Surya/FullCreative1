package org.full.controller;

import java.util.UUID;
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
public class CreateAList {

	ModelAndView mv = new ModelAndView();

	@RequestMapping(value = "/CreateAList", method = RequestMethod.GET)
	public ModelAndView add() {
		mv.setViewName("Post");
		return mv;
	}

	@RequestMapping(value = "/CreateAList", method = RequestMethod.POST)
	public ModelAndView add1(HttpServletRequest request, HttpServletResponse response) {

		String content = request.getParameter("content");

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Todo todo = context.getBean(Todo.class);
		todo.setContent(content);

		UUID uuid = UUID.randomUUID();
		String uuidNumber = uuid.toString();
		todo.setId(uuidNumber);

		HttpSession session = request.getSession();
		String emailId = (String) session.getAttribute("User");

		UserTodo userTodo = UserTodo.getInstance();

		if (UserTodo.todo1.containsKey(emailId)) {
			UserTodo.addTodo(emailId, todo);
		} else {
			UserTodo.createTodo(emailId, todo);
		}

		mv.addObject("TITLE", UserTodo.todo1.get(emailId));
		mv.setViewName("Result");
		return mv;
	}

//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws IOException, ServletException {
//
//		RequestDispatcher rd = request.getRequestDispatcher("/Post.jsp");
//		rd.forward(request, response);
//
//	}

//	@Override
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws IOException, ServletException {

	// String content = request.getParameter("content");

}

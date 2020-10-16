package org.todolist1;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String userName = request.getParameter("UserName");
		String password = request.getParameter("Password");

		Authentication authentication = new Authentication();
		boolean result = authentication.verifyLoginUser(userName, password);

		List<UserDetails> userDetails = CreateAnAccountObject.userDetails;
		userDetails.stream().forEach(user -> {

			if (userName.equals(user.getUserName())) {
				String emailId = user.getEmailId();
				HttpSession session = request.getSession();
				session.setMaxInactiveInterval(1800);
				session.setAttribute("User", emailId);
			}
		});

		UserTodo.getInstance();							
		if(result) {
		if(UserTodo.todo1.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("/Index.jsp");
			rd.forward(request, response);			
		}else {
			HttpSession session = request.getSession();
			String emailId = (String) session.getAttribute("User");
			request.setAttribute("TITLE", UserTodo.todo1.get(emailId));
			RequestDispatcher rd = request.getRequestDispatcher("/Index.jsp");
			rd.forward(request, response);
		}}else {
			RequestDispatcher rd = request.getRequestDispatcher("/Error.jsp");
			rd.forward(request, response);
		}
		
	}
}

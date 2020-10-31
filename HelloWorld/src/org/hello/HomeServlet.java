package org.hello;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String UserName = request.getParameter("UserName");
//		response.getWriter().print(UserName + "!!! Hello World Welcomes You");
//		
		RequestDispatcher rd = request.getRequestDispatcher("/Home.jsp");
		rd.forward(request, response);
	}

}

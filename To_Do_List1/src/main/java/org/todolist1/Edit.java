package org.todolist1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

@WebServlet("/Edit")

public class Edit extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String id = "";
		if (request.getMethod().equals("POST")) {

			{
				StringBuffer sb = new StringBuffer();
				BufferedReader bufferedReader = null;

				try {

					bufferedReader = request.getReader();
					char[] charBuffer = new char[128];
					int bytesRead;
					while ((bytesRead = bufferedReader.read(charBuffer)) != -1) {
						sb.append(charBuffer, 0, bytesRead);
					}

				} catch (IOException ex) {
					throw ex;
				} finally {
					if (bufferedReader != null) {
						try {
							bufferedReader.close();
						} catch (IOException ex) {
							throw ex;
						}
					}
				}

				id = sb.toString();

			}
		}

		Gson gson = new Gson();
		Map<String, Object> map = gson.fromJson(id, Map.class);
		String newId = (String) map.get("Id");
		HttpSession session = request.getSession();
		String emailId = (String) session.getAttribute("User");
		List<Todo> king = UserTodo.todo1.get(emailId);

		try {
			king.stream().forEach(user -> {
				if (newId.equals(user.getId())) {
					user.setContent("");
				}
			});
		} catch (NullPointerException e) {
			System.out.println("NullPointerException Handled");
		}

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print("");

	}

}

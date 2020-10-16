package org.todolist1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@WebServlet("/CreateAList")

public class CreateAList extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String content = "";
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

				content = sb.toString();

			}
		}

		Gson gson = new Gson();
		Map<String, Object> map = gson.fromJson(content, Map.class);

		String newcontent = (String) map.get("Content");
		String newid = (String) map.get("Id");

		Todo ref = new Todo();
		ref.setContent(newcontent);
		ref.setId(newid);

		HttpSession session = request.getSession();
		String emailId = (String) session.getAttribute("User");

		UserTodo userTodo = UserTodo.getInstance();

		if (UserTodo.todo1.containsKey(emailId)) {
			UserTodo.addTodo(emailId, ref);
		} else {
			UserTodo.createTodo(emailId, ref);
		}
		
		String json = gson.toJson(content);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().print(json);

	}
}

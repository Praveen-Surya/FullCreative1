package org.full.controller;

import java.util.ConcurrentModificationException;
import java.util.List;
import org.springframework.stereotype.Controller;


@Controller
public class UpdateAList {

		
	List<Todo> king = CreateAListObject.todo;

	public void modify(String content, String id) throws ConcurrentModificationException {

		king.stream().forEach(user -> {

			if (id.equals(user.getId())) {
				user.setContent(content);
				CreateAListObject.addTodo(user);
			}

		});
		
	}

}
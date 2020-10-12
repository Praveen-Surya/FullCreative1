package org.full.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.full.model.User;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index.jsp";
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)

	public String home(@Validated User user, Model model) {
		model.addAttribute("userName", user.getUserName());
		return "Home.jsp";
	}

}

package org.full.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
	
	
	ModelAndView mv = new ModelAndView();

	@RequestMapping(value = "/Home", method = RequestMethod.GET)
	public ModelAndView add() {
		mv.setViewName("home");
		return mv;
	}

}

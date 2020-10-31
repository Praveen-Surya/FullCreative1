package org.full.controller;

import org.full.service.AddService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AddController {
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public ModelAndView add(@RequestParam("name")String name,@RequestParam("number")long number) {
		
		
//		String name=request.getParameter("name");
//		long number=Long.parseLong(request.getParameter("number"));
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		AddService addservice= context.getBean(AddService.class);
    	String k= addservice.add(name, number);
		   	
    	
    	
//		AddService as = new AddService();
//		int k = as.add(i, j);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("Display");
        mv.addObject("result",k);
        
		return mv;
	}

}

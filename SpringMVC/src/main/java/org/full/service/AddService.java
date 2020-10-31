package org.full.service;

import org.springframework.stereotype.Controller;

@Controller
public class AddService {

	public String add(String name, long number) {

		return name + " " + number;
	}

}

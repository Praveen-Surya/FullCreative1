package org.full.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
@Controller
public class Authentication {

	private boolean flag = false;
	CreateAnAccountObject createAnAccountObject = CreateAnAccountObject.getInstance();
	List<UserDetails> userDetails = CreateAnAccountObject.userDetails;

	public boolean verifyLoginUser(String userName, String password) {

		if (userDetails.isEmpty()) {
			return flag;
		}

		else {
			userDetails.stream().forEach(user -> {
				if (userName.equals(user.getUserName()) && password.equals(user.getPassword())) {
					flag = true;
				}
			});
			return flag;
		}

	}
}

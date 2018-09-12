package com.iries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.iries.service.UserService;

@Controller
public class UserController {

	private UserService userService;

	@Autowired(required=true)
	@Qualifier(value="userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	
}

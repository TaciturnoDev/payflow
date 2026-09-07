package com.payflow.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payflow.entity.User;
import com.payflow.service.UserService;

@RestController
@RequestMapping("/users")

public class UserController {
	
	private final UserService userService;
	    
	
	public UserController(UserService userService) {
		this.userService = userService;
		
	}
	
	@PostMapping
	public User create(@RequestBody User user) {
		return userService.save(user);
	}

}

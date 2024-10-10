package com.example.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.first.domain.UserInfo;
import com.example.first.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public String signup() {
		return "user/insertUser";
	}
	
	@PostMapping("/user/insert")
	public String insert(UserInfo user) {
		
		userService.insertUser(user);
		
		return "redirect:/";
	}

}

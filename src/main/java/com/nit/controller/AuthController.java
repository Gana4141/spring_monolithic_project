package com.nit.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.User;
import com.nit.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController 
{ 
	private final UserService userService;

	
	
	@PostMapping("/register")
	public User register(@RequestBody User user)
	{
		return userService.register(user);
	}
	
	
	
	
		
	  	

}

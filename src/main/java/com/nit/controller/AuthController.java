package com.nit.controller; 
import org.springframework.web.bind.annotation.PostMapping;
import  org.springframework.web.bind.annotation.RestController;

import com.nit.dto.RegisterRequest;
import com.nit.model.User;
import com.nit.service.UserService;

import lombok.RequiredArgsConstructor;
  
  @RestController  
  @RequiredArgsConstructor
  public class AuthController 
  {  
  private final UserService userService;
    @PostMapping("/register")
    public User register(RegisterRequest register)
  {
  
  return userService.register(register);
  } 
    }
 

  
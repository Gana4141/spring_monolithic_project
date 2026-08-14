package com.nit.service;

import org.springframework.stereotype.Service;

import com.nit.model.User;
import com.nit.repository.UserReposotory;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService
{
	private final UserReposotory userReposotory;
	
    public  User register(User user)
    {	
    return 	userReposotory.save(user);
    	 
    }
}

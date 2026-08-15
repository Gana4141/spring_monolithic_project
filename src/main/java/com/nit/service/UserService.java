package com.nit.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nit.dto.RegisterRequest;
import com.nit.model.User;
import com.nit.repository.UserReposotory;

import lombok.RequiredArgsConstructor;
	
@Service	
@RequiredArgsConstructor
public class UserService 
{

//    private final UserReposotory userReposotory;
//
//    public UserResponse register(Register request) {
//
//        User user = new User(
//                null,
//                request.getEmail(),
//                request.getPassword(),
//                request.getFirstName(),
//                request.getLastName(),
//                LocalDateTime.now(),
//                LocalDateTime.now(),
//                List.of(),
//                List.of()
//        );
//
//        User saveUser = userReposotory.save(user);
//
//        return mapToResponse(saveUser);
//    }
//
//    private UserResponse mapToResponse(User saveUser) {
//
//        UserResponse response = new UserResponse();
//
//        response.setId(saveUser.getId());
//        response.setEmail(saveUser.getEmail());
//        response.setPassword(saveUser.getPassword());
//        response.setFirstName(saveUser.getFirstName());
//        response.setLastName(saveUser.getLastName());
//        response.setCreatedAt(saveUser.getCreatedAt());
//        response.setUpdatedAt(saveUser.getUpdateAt();
//	
//        return response;
//    }
	
	
	private final UserReposotory userReposotory;
	
	public User register(RegisterRequest request)
	{
		User user = new User();
		return userReposotory.save(user);
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
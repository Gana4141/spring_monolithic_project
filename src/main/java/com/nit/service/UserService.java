package com.nit.service;

import org.springframework.stereotype.Service;

import com.nit.dto.UserResponse;
import com.nit.model.User;
import com.nit.repository.UserReposotory;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserReposotory userReposotory;

    public UserResponse register(UserResponse request) {


		  User user = new User();

		  user.setEmail(request.getEmail()); user.setPassword(request.getPassword());
		  user.setFirstName(request.getFirstName());
		  user.setLastName(request.getLastName());
		  user.setCreatedAt(request.getCreatedAt());
		  user.setUpdatedAt(request.getUpdatedAt());

		  User savedUser = userReposotory.save(user);

		  return mapToResponse(savedUser);

    }

    private UserResponse mapToResponse(User savedUser) {

        UserResponse response = new UserResponse();

        response.setId(savedUser.getId());
        response.setEmail(savedUser.getEmail());
        response.setPassword(savedUser.getPassword());
        response.setFirstName(savedUser.getFirstName());
        response.setLastName(savedUser.getLastName());
        response.setCreatedAt(savedUser.getCreatedAt());
        response.setUpdatedAt(savedUser.getUpdatedAt());

        return response;
    }
}
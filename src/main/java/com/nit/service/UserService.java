/*
 * package com.nit.service;
 * 
 * import org.springframework.stereotype.Service;
 * 
 * import com.nit.dto.UserResponse; import com.nit.model.User; import
 * com.nit.repository.UserReposotory;
 * 
 * import lombok.RequiredArgsConstructor;
 * 
 * @Service
 * 
 * @RequiredArgsConstructor public class UserService {
 * 
 * private final UserReposotory userReposotory;
 * 
 * public UserResponse register(RegisterRequest request) {
 * 
 * User user = new User( null, request.getEmail(), request.getPassword(),
 * request.getFirstName(), request.getLastName(), null, null, null, null );
 * 
 * User savedUser = userReposotory.save(user);
 * 
 * return mapToResponse(savedUser); }
 * 
 * private UserResponse mapToResponse(User savedUser) {
 * 
 * UserResponse response = new UserResponse();
 * 
 * response.setId(savedUser.getId()); response.setEmail(savedUser.getEmail());
 * response.setFirstName(savedUser.getFirstName());
 * response.setLastName(savedUser.getLastName());
 * response.setCreatedAt(savedUser.getCreatedAt());
 * response.setUpdatedAt(savedUser.getUpdateAt());
 * 
 * return response; } }
 */

package com.nit.service;

import org.springframework.stereotype.Service;

import com.nit.dto.RegisterRequest;
import com.nit.model.User;
import com.nit.repository.UserReposotory;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService{
	
	private final UserReposotory userReposotory;
	
//	public User register(RegisterRequest request)
//	{
//		
//		
//		User users = new  User(
//	    request.getEmail(),
//	    request.getPassword(),
//	    request.getFirstName(),
//	    request.getLastName(),
//	    request.getFirstName(),
//	    request.getUpdatedAt(),
//	    request.
//		
//				
//				);
//	
//		return userReposotory.save(user);
	

    
}
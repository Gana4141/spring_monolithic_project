package com.nit.service;
import org.springframework.stereotype.Service;
import com.nit.model.User;
import com.nit.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService
{
	
	private final UserRepository userrepository ;
	public User register(User user)
	{
		
		return userrepository.save(user);
		}}
	
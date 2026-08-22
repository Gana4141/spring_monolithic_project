package com.nit.service;

import org.springframework.stereotype.Service;

import com.nit.dto.RecommendationRequest;
import com.nit.model.Activity;
import com.nit.model.Recommendation;
import com.nit.model.User;
import com.nit.repository.ActivityRepository;
import com.nit.repository.UserReposotory;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RecommendationService 
{
	private final UserReposotory userReposotory;
	private final ActivityRepository activityRepository;

	public Recommendation generateRecommendation
	(RecommendationRequest request)
	{
		 User user =userReposotory.findById(request.getUserId())
				 .orElseThrow(()->new RuntimeException("User Not Founds :"+request.getUserId()));
		
		 
		 Activity activity =activityRepository.findById(request.getUserId())
				 .orElseThrow(()->new RuntimeException("Activity Not Founds :"+request.getActivityId()));
		 
		 //Recommendation recommendation =Recommendation
		 
		return null;
	}
  
}

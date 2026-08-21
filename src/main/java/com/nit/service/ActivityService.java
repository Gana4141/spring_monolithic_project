package com.nit.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.nit.dto.ActivityRequest;
import com.nit.dto.ActivityResponse;
import com.nit.model.Activity;
import com.nit.model.User;
import com.nit.repository.ActivityRepository;
import com.nit.repository.UserReposotory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ActivityService
{
  private final ActivityRepository activityRepository;
  private final  UserReposotory userReposotory;
  public ActivityResponse trackActivity(ActivityRequest request)
  {
	  User user = userReposotory.findById(request.getUserId())
			  .orElseThrow(()->new RuntimeException("Invalid user +"+request.getUserId()));
	  Activity activity = Activity.builder()
			  .user(user)
			 .type(request.getType())
			 .duration(request.getDuration())
              .caloriesBurned(request.getCaloriesBurned())
              .startTime(request.getStartTime())
              .additionalsMetrics(request.getAdditionalsMetrics())
              .build();
 Activity savedActivity=	activityRepository.save(activity);
   return mapToResponse(savedActivity);
  }
  private ActivityResponse mapToResponse(Activity activity)
  {
	  ActivityResponse  response = new ActivityResponse();
	  response.setId(activity.getId());
	  response.setUserId(activity.getUser().getId());
	  response.setType(activity.getType());
	  response.setDuration(activity.getDuration());
	  response.setCaloriesBurned(activity.getCaloriesBurned());
	  response.setStartTime(activity.getStartTime());
	  response.setAdditionalsMetrics(activity.getAdditionalsMetrics());
	  response.setCreatedAt(activity.getCreatedAt());
	  response.setUpdatedAt(activity.getUpdatedAt());
	return response;
  }
  public  List<ActivityResponse> getUserActivities(@RequestHeader(value = "X-User-ID") String userId)
  {
      List<Activity> activitiesList=activityRepository.findByUserId(userId);
      
	return null;
  }

}

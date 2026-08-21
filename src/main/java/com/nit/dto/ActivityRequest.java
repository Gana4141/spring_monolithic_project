package com.nit.dto;

import java.time.LocalDateTime;
import java.util.Map;

import com.nit.model.ActivityType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public  class ActivityRequest
{
	// private String id;
	   private   String  userId;
	   private ActivityType type;
	   private Map<String, Object> additionalsMetrics;
	   private Integer duration;
	   private Integer caloriesBurned;
	   private LocalDateTime  startTime;

}

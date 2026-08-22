package com.nit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.dto.RecommendationRequest;
import com.nit.model.Recommendation;
import com.nit.service.RecommendationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/recommendation")
@RequiredArgsConstructor
public class RecommendationController 
{
	private final RecommendationService recommendationService;
	@PostMapping("/generate")
	public ResponseEntity<Recommendation>  generateRecommendation(
   @RequestBody RecommendationRequest request	
			)
	
	{
		//Recommendation recommendation =recommendationService.generateRecommendation
		return null; //"ResponseEntity.ok+(recommendation)"";
	}
}

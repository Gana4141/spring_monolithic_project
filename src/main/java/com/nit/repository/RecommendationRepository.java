package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.model.Recommendation;

public interface RecommendationRepository 
extends JpaRepository<Recommendation, String>

{

}

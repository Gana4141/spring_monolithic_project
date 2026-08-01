package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.model.Recommendation;
@Repository
public interface RecommendationRepository  extends JpaRepository<Recommendation, String>
{

}

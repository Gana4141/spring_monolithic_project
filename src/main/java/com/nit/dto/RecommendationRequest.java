package com.nit.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecommendationRequest
{
  private String userId;
  private String activityId;
  private List<String> improvements;
  private List<String> suggestions;
  private List<String> safety;
}

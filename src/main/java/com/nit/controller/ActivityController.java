package com.nit.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.dto.ActivityRequest;
import com.nit.dto.ActivityResponse;
import com.nit.service.ActivityService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/activities")
@RequiredArgsConstructor
public class ActivityController

{

	  private final ActivityService activityService;
    @PostMapping
    public ResponseEntity<ActivityResponse> trackActivity( @RequestBody  ActivityRequest request) {

        return ResponseEntity.ok(activityService.trackActivity(request));
    }

    @GetMapping
    public ResponseEntity<List<ActivityResponse>> getActivities() {

        return null;
    }
}
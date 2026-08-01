package com.nit.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.persistence.autoconfigure.EntityScan;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	 private String id;
     private String email;
     private String password;
     private String firstName;
     private String lastName;
     private LocalDateTime createdAt;
     private LocalDateTime updateAt;

     @OneToMany(mappedBy = "user",cascade = CascadeType.ALL ,orphanRemoval = true)
     @JsonIgnore
     private List<Activity> activities= new ArrayList<>();
     
		
		  @OneToMany(mappedBy = "recommdations",cascade = CascadeType.ALL
		  ,orphanRemoval = true)
		  
		 @JsonIgnore private List<Activity> recommdations= new ArrayList<>();
		 
     
     
     
     
     
     
}

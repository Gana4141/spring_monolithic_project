package com.nit.model;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Recommendation 
{
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
		 private String id;
	  private String type ;
	  
	  @Column(length = 2000)
	  private  List< String> recommendation;
	  
	  @JdbcTypeCode(SqlTypes.JSON)
	  @Column(columnDefinition = "json")
	  private String improvment;
	  
	  @JdbcTypeCode(SqlTypes.JSON)
	  @Column(columnDefinition = "json")
	  private List<String> suggestions;
	  @JdbcTypeCode(SqlTypes.JSON)
	  @Column(columnDefinition = "json")
	  private List<String> safety;
	  
	  private LocalDateTime createdAt;
	     private LocalDateTime updateAt;
	  
	  
	  	
	  	
	  
}

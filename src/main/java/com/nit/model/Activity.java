package com.nit.model;

import java.time.LocalDateTime;
import java.util.Map;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JdbcTypeCode(SqlTypes.JSON)
	@Column(columnDefinition = "json")
	private Map<String, Object> additionalsMatrix;
	@ManyToOne
	@JoinColumn(name="user_id",nullable = false,foreignKey = @ForeignKey(name="fk_activity_user"))
	@JsonIgnore
	private User user ;

	private ActivityType type;

	private Integer duration;

	private Integer caloriesBurned;

	private LocalDateTime startTime;

	private LocalDateTime createTime;

	private LocalDateTime updateAt;
	
	
	
	

}
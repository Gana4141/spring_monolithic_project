package com.nit.model;
import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
public class Recommendation 
{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    
    private String type;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id",nullable = false,foreignKey = @ForeignKey(name="fk_user_activity"))
    @JsonIgnore
    private User user;
    
    @ManyToOne
    @JoinColumn(name="activity_id",nullable = false,foreignKey = @ForeignKey(name="fk_activity"))
    @JsonIgnore
    private Activity activity;
    
    
    @Column(length = 2000)
    private String   recommendation;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "json")
    private List<String> improvements;
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "json")
    
    private List<String> suggestions;
    
    
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "json")
    private List<String> safety;
    
    private LocalDateTime createdAT;
    
    private LocalDateTime  updatedAt;
    
}
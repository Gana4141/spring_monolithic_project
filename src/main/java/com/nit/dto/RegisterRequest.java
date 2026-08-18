package com.nit.dto;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
   
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest
{      

    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;  
    
}                   
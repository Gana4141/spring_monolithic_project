package com.nit.service;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;
import com.nit.dto.RegisterRequest;
import com.nit.model.User;
import com.nit.repository.UserReposotory;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserReposotory userReposotory;

    public User register(RegisterRequest request) {

        User user = new User(
                null,
                request.getEmail(),    
                request.getPassword(),
                request.getFirstName(),
                request.getLastName(),
                LocalDateTime.now(),
                LocalDateTime.now(),
                List.of(),
                List.of()
        );
        return userReposotory.save(user);         
    }
}
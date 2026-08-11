package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.model.User;

@Repository
public interface UserReposotory extends JpaRepository<User, String>
{

}

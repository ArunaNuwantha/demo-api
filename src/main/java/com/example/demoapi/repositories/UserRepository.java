package com.example.demoapi.repositories;

import com.example.demoapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    public User findUserByUsername(String username);
}

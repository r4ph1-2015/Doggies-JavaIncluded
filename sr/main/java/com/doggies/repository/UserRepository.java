package com.doggies.repository;

import com.doggies.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);  // Custom query method for finding a user by username
}

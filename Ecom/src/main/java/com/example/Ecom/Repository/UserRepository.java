package com.example.Ecom.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Ecom.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Login ke liye
    Optional<User> findByEmail(String email);

    // Check if email already exists (register validation)
    boolean existsByEmail(String email);

}

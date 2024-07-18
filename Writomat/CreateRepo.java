package com.example.socialmediaanalytics.repository;

import com.example.socialmediaanalytics.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

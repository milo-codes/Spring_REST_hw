package com.codeclan.example.FileService.repositories;

import com.codeclan.example.FileService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}

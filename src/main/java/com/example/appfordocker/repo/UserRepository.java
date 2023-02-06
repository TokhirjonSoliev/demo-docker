package com.example.appfordocker.repo;

import com.example.appfordocker.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}

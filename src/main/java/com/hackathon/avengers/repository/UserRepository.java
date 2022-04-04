package com.hackathon.avengers.repository;

import com.hackathon.avengers.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

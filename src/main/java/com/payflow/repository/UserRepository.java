package com.payflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payflow.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	boolean existsByEmail(String email);
}
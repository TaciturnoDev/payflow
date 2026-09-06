package com.payflow.service;

import org.springframework.stereotype.Service;

import com.payflow.entity.User;
import com.payflow.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {

        if (userRepository.existsByEmail(user.getEmail())) {
            throw new IllegalArgumentException("E-mail já cadastrado");
        }

        return userRepository.save(user);
    }
}
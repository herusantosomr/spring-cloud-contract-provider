package com.hackathon.avengers.service;

import com.hackathon.avengers.dto.IdDTO;
import com.hackathon.avengers.entity.User;
import com.hackathon.avengers.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public IdDTO createUser(User user) {
        User savedUser = userRepository.save(user);
        return new IdDTO(savedUser.getId());
    }

    @Override
    public IdDTO updateUser(Long id, User user) {
        User userFound = userRepository.findById(id).orElseThrow(RuntimeException::new);
        userFound.updateFrom(user);
        User savedUser = userRepository.save(user);
        return new IdDTO(savedUser.getId());
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}

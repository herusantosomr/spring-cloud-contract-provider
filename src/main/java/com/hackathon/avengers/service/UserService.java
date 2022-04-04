package com.hackathon.avengers.service;

import com.hackathon.avengers.dto.IdDTO;
import com.hackathon.avengers.entity.User;

public interface UserService {

    IdDTO createUser(User user);

    IdDTO updateUser(Long id, User user);

    User getById(Long id);

}

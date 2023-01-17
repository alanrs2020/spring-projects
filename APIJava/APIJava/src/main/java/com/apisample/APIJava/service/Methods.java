package com.apisample.APIJava.service;

import com.apisample.APIJava.model.User;

import java.util.List;
import java.util.Optional;

public interface Methods {
    User saveNewUser(User user);
    List<User> getAllUsers();
    Optional<User> getUserById(long id);
}

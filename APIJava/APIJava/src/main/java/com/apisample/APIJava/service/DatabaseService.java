package com.apisample.APIJava.service;

import com.apisample.APIJava.model.User;
import com.apisample.APIJava.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatabaseService implements Methods {
    private UserRepository userRepository;
    DatabaseService(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    public User saveNewUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(long id) {
        return userRepository.findById(id);
    }
}

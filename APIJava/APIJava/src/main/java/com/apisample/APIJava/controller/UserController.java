package com.apisample.APIJava.controller;


import com.apisample.APIJava.model.User;
import com.apisample.APIJava.service.DatabaseService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class UserController {



    private DatabaseService databaseService;
    public UserController(DatabaseService databaseService){
        this.databaseService = databaseService;
    }
    @GetMapping("/users")
    public List getAllUser(){
        return databaseService.getAllUsers();
    }

    @PostMapping("/addNewUser")
    @ResponseBody
    public User addNewUser(@RequestBody User user){
        return  databaseService.saveNewUser(user);
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable("id") long id){
              return databaseService.getUserById(id);
        }

}

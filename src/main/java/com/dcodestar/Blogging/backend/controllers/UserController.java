package com.dcodestar.Blogging.backend.controllers;

import com.dcodestar.Blogging.backend.models.User;
import com.dcodestar.Blogging.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    @PostMapping("user")
    public String saveUser(@RequestBody User userobject){
        userRepository.save(userobject);
        return "success";
    }

}

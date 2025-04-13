package com.example.demo.controller;

import com.example.demo.dto.UserCreateRequestDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.security.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserDetailsServiceImpl userService;

    @PostMapping("/users")
    public UserDTO createUser(@RequestBody UserCreateRequestDTO userRequest) {
        User createdUser = userService.createUser(userRequest.getUsername(), userRequest.getPassword());
        return UserMapper.toDto(createdUser);
    }
}


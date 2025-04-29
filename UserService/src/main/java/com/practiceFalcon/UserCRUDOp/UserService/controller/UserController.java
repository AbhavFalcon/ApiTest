package com.practiceFalcon.UserCRUDOp.UserService.controller;
import com.practiceFalcon.UserCRUDOp.UserService.AppService.AppService;
import com.practiceFalcon.UserCRUDOp.UserService.dto.UserDto;
import com.practiceFalcon.UserCRUDOp.UserService.repository.UserRepository;
import com.practiceFalcon.UserCRUDOp.UserService.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class UserController {
    @Autowired
    private AppService appService;

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody UserDto userDto) {
        User createdUser = appService.crearUser(userDto);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED).getBody();
    }

    @PutMapping("/users/{id}")
    public User updateUser(@RequestBody UserDto userDto, @PathVariable("id") int userId) {
        return appService.updateUser(userDto, userId);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable("id") int userId) {
        appService.deleteUser(userId);
        return "User deleted";
    }



}

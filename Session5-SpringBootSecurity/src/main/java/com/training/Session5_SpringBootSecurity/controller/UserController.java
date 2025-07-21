package com.training.Session5_SpringBootSecurity.controller;

import com.training.Session5_SpringBootSecurity.entities.User;
import com.training.Session5_SpringBootSecurity.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user){
        return this.userService.addUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return this.userService.getAllUsers();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/{username}")
    public User getUser(@PathVariable String username){
        return this.userService.getUser(username);
    }


}

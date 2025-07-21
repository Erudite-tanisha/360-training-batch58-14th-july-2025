package com.training.Session3_RESTAPI.controller;

import com.training.Session3_RESTAPI.entities.User;
import com.training.Session3_RESTAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable int id){
        return userService.deleteUserById(id);
    }

//    @GetMapping("/{email}")
//    public User findByEmail(@PathVariable String email){
//        return userService.findByEmail(email);
//    }

    @GetMapping("/{character}")
    public List<User> findByAlphabet(@PathVariable Character character){
        return userService.findByAlphabet(character);
    }
}

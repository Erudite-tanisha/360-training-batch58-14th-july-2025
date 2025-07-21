package com.training.Session3_RESTAPI.service;

import com.training.Session3_RESTAPI.entities.User;

import java.util.List;

public interface UserService {

    User addUser(User user);

    List<User> getAllUsers();

    User deleteUserById(int id);

    User findByEmail(String email);

    List<User> findByAlphabet(Character character);

}

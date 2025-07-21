package com.training.Session3_RESTAPI.service.Impl;

import com.training.Session3_RESTAPI.entities.User;
import com.training.Session3_RESTAPI.repo.UserRepository;
import com.training.Session3_RESTAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

//    private List<User> list = new ArrayList<>();

    @Autowired
    private UserRepository userRepository;


    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User deleteUserById(int id) {
        User foundUser = userRepository.findById(id).orElse(null);
        userRepository.deleteById(id);
        return foundUser;
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> findByAlphabet(Character character) {
        return userRepository.findUserStartingWithS(character);
    }


}

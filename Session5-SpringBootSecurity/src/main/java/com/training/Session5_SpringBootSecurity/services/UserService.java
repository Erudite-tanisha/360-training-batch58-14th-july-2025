package com.training.Session5_SpringBootSecurity.services;

import com.training.Session5_SpringBootSecurity.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("tanisha", "abc", "tan@gmail.com"));
        list.add(new User("sai", "def", "sai@gmail.com"));
        list.add(new User("harsimran", "xyz", "har@gmail.com"));
    }

    public User addUser(User user){
        this.list.add(user);
        return user;
    }

    public List<User> getAllUsers(){
        return this.list;
    }

    public User getUser(String username){
        return this.getAllUsers().stream().filter(user -> user.getUsername().equals(username)).findAny().orElse(null);
    }

}

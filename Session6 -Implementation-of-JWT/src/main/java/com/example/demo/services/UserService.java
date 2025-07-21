package com.example.demo.services;

import com.example.demo.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "tanisha", "tan@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "tanisha1", "abc1@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "tanisha2", "abc2@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "tanisha3", "abc3@gmail.com"));
    }


    public List<User> getAllUsers(){
        return this.store;
    }
}

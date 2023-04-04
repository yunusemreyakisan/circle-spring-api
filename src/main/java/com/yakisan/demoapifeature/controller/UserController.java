package com.yakisan.demoapifeature.controller;

import com.yakisan.demoapifeature.model.User;
import com.yakisan.demoapifeature.repository.UserRepository;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yunusemreyakisan on 4.04.2023
 */
@RestController
@Table(name = "user")
public class UserController {
    @Autowired
    UserRepository repository;

    //Kullanicilari geri dondurur.
    @GetMapping(value = "/users")
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    //Kullanici ekler ve tum kullanicilari geri dondurur.
    @PostMapping(value = "/add")
    public List<User> addUser(@RequestBody final User user) {
        repository.save(user);
        return repository.findAll();
    }
}




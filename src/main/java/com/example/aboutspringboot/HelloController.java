package com.example.aboutspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    private Map<Long, User> users = new HashMap<>();
    private long nextId = 1L;

    @PostMapping("/users")
    public User createUser(@RequestBody User newUser) {
        newUser.setId(nextId++);
        users.put(newUser.getId(),newUser);
        return newUser;
    }


    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    @GetMapping("/user")
    public User getUser() {
        User user = new User("Dingco", 20);
        return user;
    }



}

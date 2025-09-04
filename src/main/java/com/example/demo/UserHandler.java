package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserHandler {

    private final PollManager pollManager;

    // no need to inject anything just to test mapping
    public UserHandler(PollManager pollManager) {
        this.pollManager = pollManager;
    }

    @PostMapping("/createUser") // no trailing slash to keep it simple
    public ResponseEntity<User> createUser(@RequestBody User user) {
        System.out.println("NEW USER: " + user.getUsername());
        return ResponseEntity.ok(user);
    }
}

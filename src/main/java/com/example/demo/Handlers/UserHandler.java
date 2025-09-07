package com.example.demo.Handlers;


import com.example.demo.DomainManager.PollManager;
import com.example.demo.Models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserHandler {

    private final PollManager pollManager;

    public UserHandler(PollManager pollManager) {
        this.pollManager = pollManager;
    }

    @PostMapping("/createUser")
    public ResponseEntity<User> createUser(@RequestBody User user) {

        UUID uuid = UUID.randomUUID();

        user.setUserId(uuid);

        pollManager.addUser(uuid, user);

        return ResponseEntity.ok(user);
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> allUserList = pollManager.getAllUsers();
        return ResponseEntity.ok(allUserList);
    }
}

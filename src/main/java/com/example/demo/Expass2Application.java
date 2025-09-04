package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Expass2Application {

    private final PollManager pollManager;

    public Expass2Application(@Autowired PollManager pollManager) {
        this.pollManager = pollManager;
    }

    public static void main(String[] args) {
        SpringApplication.run(Expass2Application.class, args);
    }

    @GetMapping("/")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }


}


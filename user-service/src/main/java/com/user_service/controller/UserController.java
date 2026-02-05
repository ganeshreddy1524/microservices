package com.user_service.controller;

import com.user_service.model.User;
import com.user_service.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> all() {
        return service.getAll();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return service.save(user);
    }
}

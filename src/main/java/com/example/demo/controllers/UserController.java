package com.example.demo.controllers;

import com.example.demo.model.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return this.userRepository.getAllUsers();
    }

    @PostMapping("/users")
    public User registerUser(@RequestParam(name = "type", required = false) String type, @RequestBody User user){
        System.out.println(user);
        if (type.equals("user")) {
            return this.userRepository.registerUser(user);
        }

        if (type.equals("guest")) {
            return this.userRepository.registerGuest(user);
        }

        return null;
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Integer id){
        return this.userRepository.getUserById(id);
    }

    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable Integer id, @RequestBody User user) {
        System.out.println(user.lastName);
        return  this.userRepository.updateUser(id, user);
    }
}

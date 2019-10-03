package se.experis.hibernateTask20.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.experis.hibernateTask20.model.User;
import se.experis.hibernateTask20.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/user/{userId}")
    public Optional<User> getUser(@PathVariable int userId) {
        System.out.println("Trying to find User: " + userId);
        return userRepository.findById(userId);
    }

}

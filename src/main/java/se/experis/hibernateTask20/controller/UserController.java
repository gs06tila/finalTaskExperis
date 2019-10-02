package se.experis.hibernateTask20.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.experis.hibernateTask20.model.User;
import se.experis.hibernateTask20.repository.UserRepository;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/addUser")
    public String addUser() {
        User aUser = new User();
        userRepository.save(aUser);

        return "200 User created";
    }

    @GetMapping("/users")
    public List<User> getAll() {
        return userRepository.findAll();
    }
}

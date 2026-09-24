package com.example.endpoint.endpoints.Controller;

import com.example.endpoint.endpoints.Entity.User;
import com.example.endpoint.endpoints.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private final UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}

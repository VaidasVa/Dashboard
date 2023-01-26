package com.preinternship.dashboard.controllers;

import com.preinternship.dashboard.entities.User;
import com.preinternship.dashboard.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController  {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody User user){
        userRepository.save(user);
        return "Saved!";
    }

    @PutMapping("/updateUser/{id}")
    public String updateUser(@PathVariable int id, @RequestBody User user){
    User updatedUser = userRepository.findById(id).get();
    updatedUser.setUserName(user.getUserName());
    updatedUser.setEmail(user.getEmail());
    updatedUser.setPassword(user.getPassword());
    userRepository.save(updatedUser);
    return "updated!";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        User removeUser = userRepository.findById(id).get();
        userRepository.delete(removeUser);
        return "Deleted";
    }


}

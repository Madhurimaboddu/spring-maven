package com.user.userregister.controller;

import com.user.userregister.model.User;

import com.user.userregister.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.lang.*;

@RestController
@RequestMapping("user/")
public class UserController {
    @Autowired
    UserServices userServices;

    @GetMapping("user-by-id/{userId}")
    public User getUserById(@PathVariable int userId){
        User res= userServices.getUserById(userId);
        return  res;

    }

    @PostMapping("add-user")
    public  String addUser(@RequestBody User user){
        userServices.addUser(user);
        return "index.html";
    }

    @DeleteMapping("delete-by-id/{userId}")
    public  String deleteUserById(@PathVariable int userId){
        userServices.deleteUserById(userId);
        return "delete is done in database"+userId;

    }
}

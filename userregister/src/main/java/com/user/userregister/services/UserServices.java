package com.user.userregister.services;

import com.user.userregister.model.User;
import com.user.userregister.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;

    public User getUserById(@PathVariable int userId) {
        User res=userRepository.findById(userId);
        return res;
    }

    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    public void deleteUserById(@PathVariable int userId) {
        userRepository.deleteById(userId);
    }
}

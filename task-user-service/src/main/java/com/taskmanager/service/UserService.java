package com.taskmanager.service;

import com.taskmanager.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public User getUserProfile(String jwt);
    public List<User> getAllUsers();
}

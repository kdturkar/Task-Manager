package com.taskmanager.controller;

import com.taskmanager.dto.UserDto;
import com.taskmanager.model.Task;
import com.taskmanager.model.TaskStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {
    @GetMapping("/tasks")
    public ResponseEntity<String> getAssignedUserTask() {
        return new ResponseEntity<>("Welcome to task service", HttpStatus.OK);
    }
}

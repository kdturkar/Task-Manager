package com.taskmanager.services;

import com.taskmanager.model.Task;
import com.taskmanager.model.TaskStatus;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TaskService {
    Task createTask(Task task, String requesterRole) throws Exception;

    Task getTaskById(Long id) throws Exception;

    List<Task> getAllTask(TaskStatus status);

    Task updateTask(Long id, Task updatedTask, Long userId) throws Exception;

    void deleteTask(Long id) throws Exception;

    Task assignedToUser(Long userId, Long taskId) throws Exception;

    List<Task> assignedUserTask(Long userId, TaskStatus status);

    Task completeTask(Long taskId) throws Exception;

}

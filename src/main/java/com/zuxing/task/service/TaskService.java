package com.zuxing.task.service;

import java.util.List;
import java.util.UUID;

import com.zuxing.task.domain.CreateTaskRequest;
import com.zuxing.task.domain.UpdateTaskRequest;
import com.zuxing.task.domain.entity.Task;

public interface TaskService {
    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();

    Task updateTask(UUID taskId, UpdateTaskRequest request);

    void deleteTask(UUID taskId);
}

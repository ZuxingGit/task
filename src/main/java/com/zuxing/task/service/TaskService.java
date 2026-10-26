package com.zuxing.task.service;

import java.util.List;

import com.zuxing.task.domain.CreateTaskRequest;
import com.zuxing.task.domain.entity.Task;

public interface TaskService {
    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();
}

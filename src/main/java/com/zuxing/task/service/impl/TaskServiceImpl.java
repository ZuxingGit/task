package com.zuxing.task.service.impl;

import java.time.Instant;

import org.springframework.stereotype.Service;

import com.zuxing.task.domain.CreateTaskRequest;
import com.zuxing.task.domain.entity.Task;
import com.zuxing.task.domain.entity.TaskStatus;
import com.zuxing.task.repository.TaskRepository;
import com.zuxing.task.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(CreateTaskRequest request) {
        Instant now = Instant.now();

        Task task = new Task(
                null,
                request.title(),
                request.description(),
                request.dueDate(),
                TaskStatus.OPEN,
                request.priority(),
                now,
                now);

        return taskRepository.save(task);
    }

}

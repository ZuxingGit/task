package com.zuxing.task.domain;

import java.time.LocalDate;

import com.zuxing.task.domain.entity.TaskPriority;
import com.zuxing.task.domain.entity.TaskStatus;

public record UpdateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskStatus status,
        TaskPriority priority) {
}

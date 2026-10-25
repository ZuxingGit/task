package com.zuxing.task.domain;

import java.time.LocalDate;
import com.zuxing.task.domain.entity.TaskPriority;

public record CreateTaskRequest(
                String title,
                String description,
                LocalDate dueDate,
                TaskPriority priority) {

}

package com.zuxing.task.mapper;

import org.springframework.stereotype.Component;

import com.zuxing.task.domain.CreateTaskRequest;
import com.zuxing.task.domain.UpdateTaskRequest;
import com.zuxing.task.domain.dto.CreateTaskRequestDto;
import com.zuxing.task.domain.dto.TaskDto;
import com.zuxing.task.domain.dto.UpdateTaskRequestDto;
import com.zuxing.task.domain.entity.Task;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public CreateTaskRequest fromDto(CreateTaskRequestDto dto) {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority());
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus());
    }

    @Override
    public UpdateTaskRequest fromDto(UpdateTaskRequestDto dto) {
        return new UpdateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.status(),
                dto.priority());
    }

}

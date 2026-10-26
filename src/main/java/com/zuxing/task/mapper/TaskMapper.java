package com.zuxing.task.mapper;

import com.zuxing.task.domain.CreateTaskRequest;
import com.zuxing.task.domain.UpdateTaskRequest;
import com.zuxing.task.domain.dto.CreateTaskRequestDto;
import com.zuxing.task.domain.dto.TaskDto;
import com.zuxing.task.domain.dto.UpdateTaskRequestDto;
import com.zuxing.task.domain.entity.Task;

public interface TaskMapper {

    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    UpdateTaskRequest fromDto(UpdateTaskRequestDto dto);

    TaskDto toDto(Task task);
}

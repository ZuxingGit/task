package com.zuxing.task.mapper;

import com.zuxing.task.domain.CreateTaskRequest;
import com.zuxing.task.domain.dto.CreateTaskRequestDto;
import com.zuxing.task.domain.dto.TaskDto;
import com.zuxing.task.domain.entity.Task;

public interface TaskMapper {

    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    TaskDto toDto(Task task);
}

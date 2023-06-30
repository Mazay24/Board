package com.example.board.Mapper;

import com.example.board.dto.TaskRequest;
import com.example.board.dto.TaskResponse;
import com.example.board.enity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface TaskMapper {
    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);
    Task toDAO(TaskRequest taskRequest);
    TaskResponse toResponse(TaskRequest taskRequest);
    TaskResponse fromEnity(Task task);
}

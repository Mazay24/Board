package com.example.board.Mapper;

import com.example.board.dto.TaskRequest;
import com.example.board.dto.TaskResponse;
import com.example.board.enity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface TaskMapper {
    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);
    Task DAO(TaskRequest taskRequest);
    TaskResponse Response(TaskRequest taskRequest);
    TaskResponse Enity(Task task);
}

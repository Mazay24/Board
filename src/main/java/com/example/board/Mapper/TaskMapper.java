package com.example.board.Mapper;

import com.example.board.dto.TaskRequest;
import com.example.board.dto.TaskResponse;
import com.example.board.enity.Task;

public interface TaskMapper {
    TaskRequest fromRequestToResponse(TaskResponse taskResponse);

    TaskResponse fromResponseToRequest(TaskRequest taskRequest);

    Task fromEntityToRequest(TaskRequest taskRequest);

    Task fromEntityToResponse(TaskResponse taskResponse);

    TaskRequest fromRequestToEntity(Task task);

    TaskResponse fromResponseToEntity(Task task);
}

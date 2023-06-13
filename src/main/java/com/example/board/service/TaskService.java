package com.example.board.service;

import com.example.board.dto.AuthorizationResponse;
import com.example.board.dto.TaskRequest;
import com.example.board.dto.TaskResponse;

public interface TaskService {
    TaskResponse getTask(String name);
    TaskResponse createTask(TaskRequest taskRequest);
    TaskResponse update(String login, TaskRequest taskRequest);
    public void delete(String name);
}

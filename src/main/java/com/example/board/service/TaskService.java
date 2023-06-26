package com.example.board.service;


import com.example.board.dto.TaskRequest;
import com.example.board.dto.TaskResponse;
import com.example.board.dto.ReleaseRequest;

public interface TaskService {
    TaskResponse getTask(Integer idTask);
    TaskResponse createTask(TaskRequest taskRequest, ReleaseRequest releaseRequest);
    TaskResponse update(Integer idTask, TaskRequest taskRequest);
    void delete(Integer idTask);
}

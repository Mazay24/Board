package com.example.board.service;


import com.example.board.dto.TaskRequest;
import com.example.board.dto.TaskResponse;
import com.example.board.enity.Task;

import java.util.List;

public interface TaskService {
    TaskResponse getTask(Integer idTask);
    List<Task> getAllTask();
    TaskResponse createTask(TaskRequest taskRequest);
    TaskResponse update(Integer idTask, TaskRequest taskRequest);
    void delete(Integer idTask);
}

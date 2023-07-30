package com.example.board.service;


import com.example.board.dto.TaskRequest;
import com.example.board.dto.TaskResponse;
import com.example.board.enity.Task;

import java.util.List;

public interface TaskService {
    TaskResponse getTask(Long idTask);
    List<Task> getAllTask();
    TaskResponse createTask(TaskRequest taskRequest);
    TaskResponse update(Long idTask, TaskRequest taskRequest);
    TaskResponse statusUpdate(Long idTask, TaskRequest taskRequest);
    //TaskResponse taskCount(Long idProject);
    TaskResponse projectCompletion(Long idProject);
    void delete(Long idTask);
}

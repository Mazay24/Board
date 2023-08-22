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
    TaskResponse statusUpdate(Integer idTask, TaskRequest taskRequest);
    //TaskResponse taskCount(Long idProject);
    TaskResponse projectCompletion(Integer idProject);
    void delete(Integer idTask);
}

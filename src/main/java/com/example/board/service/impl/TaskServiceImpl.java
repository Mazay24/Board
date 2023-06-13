package com.example.board.service.impl;

import com.example.board.dto.TaskRequest;
import com.example.board.dto.TaskResponse;
import com.example.board.enity.Task;
import com.example.board.exception.Code;
import com.example.board.exception.CommonException;
import com.example.board.repository.TaskRepository;
import com.example.board.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public TaskResponse getTask(String name) {
        Task task = taskRepository.findByTaskName(name);
        if (task == null) {
            System.out.println("Задача не найдена");
            throw CommonException.builder().code(Code.TASK_ERROR).message("Задача с таким названием не найден").httpStatus(HttpStatus.BAD_REQUEST).build();
        } else {
            System.out.println(task);

        }
        return new TaskResponse(task.getTaskName(),task.getExecutor(),task.getTaskStatus());
    }

    @Override
    public TaskResponse createTask(TaskRequest taskRequest) {
        Task task = taskRepository.findByTaskName(taskRequest.getTaskName());
        if (task == null){
            taskRepository.saveAndFlush(taskRequest.toDAO());
        }
        else {
            System.out.println("Такой проект уже существует");
            throw CommonException.builder().code(Code.TASK_ERROR).message("Задача с таким названием уже существует!").httpStatus(HttpStatus.BAD_REQUEST).build();
        }
        return new TaskResponse(taskRequest.getTaskName(), taskRequest.getExecutor(), taskRequest.getTaskStatus());
    }

    @Override
    public TaskResponse update(String name, TaskRequest taskRequest) {
        Task task = taskRepository.findByTaskName(name);
        if (task == null) {
            System.out.println("Пользователь не найден");
            throw CommonException.builder().code(Code.TASK_ERROR).message("Задача с таким названием не найден").httpStatus(HttpStatus.BAD_REQUEST).build();
        } else {
            taskRepository.delete(task);
            taskRepository.saveAndFlush(taskRequest.toDAO());
        }
        return new TaskResponse(taskRequest.getTaskName(), taskRequest.getExecutor(), taskRequest.getTaskStatus());
    }

    @Override
    public void delete(String name) {
        Task task = taskRepository.findByTaskName(name);
        if (task == null) {
            System.out.println("Задача не найдена!");
            throw CommonException.builder().code(Code.TASK_ERROR).message("Задача с таким названием не найден").httpStatus(HttpStatus.BAD_REQUEST).build();
        } else {
            taskRepository.delete(task);
        }
    }
}

package com.example.board.service.impl;

import com.example.board.TaskMapper;
import com.example.board.dto.BoardRequest;
import com.example.board.dto.ReleaseRequest;
import com.example.board.dto.TaskRequest;
import com.example.board.dto.TaskResponse;
import com.example.board.enity.Task;
import com.example.board.exception.NotFoundException;
import com.example.board.repository.TaskRepository;
import com.example.board.service.BoardService;
import com.example.board.service.RealeaseService;
import com.example.board.service.TaskService;

import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;
    private final RealeaseService realeaseService;
    private final BoardService boardService;
    public TaskMapper mapper = TaskMapper.INSTANCE;

    public TaskServiceImpl(TaskRepository taskRepository, RealeaseService realeaseService, BoardService boardService) {
        this.taskRepository = taskRepository;
        this.realeaseService = realeaseService;
        this.boardService = boardService;
    }

    @Override
    public TaskResponse getTask(Integer idTask) {
        Task task = taskRepository.findByIdTask(idTask);
        if (task == null) {
            throw new NotFoundException("Задача не найдена");
        } else {
            System.out.println(task);

        }
        return mapper.fromEnity(task);
    }

    @Override
    public TaskResponse createTask(TaskRequest taskRequest, ReleaseRequest releaseRequest) {
        BoardRequest boardRequest = new BoardRequest();
        Task task = taskRepository.findByIdTask(taskRequest.getIdTask());
        if (task == null){
            taskRepository.saveAndFlush(mapper.toDAO(taskRequest));
            Integer id = task.getIdTask();
            releaseRequest.setIdTask(id);
            realeaseService.createRealease(releaseRequest);
            //boardService.update(id, boardRequest);
        }
        else {
            throw new NotFoundException("Задача уже существует");
        }
        return mapper.toResponse(taskRequest);
    }

    @Override
    public TaskResponse update(Integer idTask, TaskRequest taskRequest) {
        Task task = taskRepository.findByIdTask(idTask);
        if (task == null) {
            throw new NotFoundException("Задача не найдена");
        } else {
            taskRepository.delete(task);
            taskRepository.saveAndFlush(mapper.toDAO(taskRequest));
        }
        return mapper.toResponse(taskRequest);
    }

    @Override
    public void delete(Integer idTask) {
        Task task = taskRepository.findByIdTask(idTask);
        if (task == null) {
            throw new NotFoundException("Задача не найдена");
        } else {
            taskRepository.delete(task);
        }
    }
}

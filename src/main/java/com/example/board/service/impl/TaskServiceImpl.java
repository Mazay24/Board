package com.example.board.service.impl;

import com.example.board.Mapper.TaskMapper;
import com.example.board.dto.TaskRequest;
import com.example.board.dto.TaskResponse;
import com.example.board.enity.Task;
import com.example.board.exception.NotFoundException;
import com.example.board.repository.TaskRepository;
import com.example.board.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    public TaskMapper mapper = TaskMapper.INSTANCE;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public TaskResponse getTask(Long idTask) {
        Task task = taskRepository.findByIdTask(idTask);
        if (task == null) {
            throw new NotFoundException("Задача не найдена");
        } else {
            System.out.println(task);

        }
        return mapper.fromEnity(task);
    }

    @Override
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    @Override
    public TaskResponse createTask(TaskRequest taskRequest) {
        Task task = taskRepository.findByIdTask(taskRequest.getIdTask());
        if (task == null){
            taskRepository.saveAndFlush(mapper.toDAO(taskRequest));
        }
        else {
            throw new NotFoundException("Задача уже существует");
        }
        return mapper.toResponse(taskRequest);
    }

    @Override
    public TaskResponse update(Long idTask, TaskRequest taskRequest) {
        Task task = taskRepository.findByIdTask(idTask);
        if (task == null) {
            throw new NotFoundException("Задача не найдена");
        } else {
            task.setTaskName(taskRequest.getTaskName());
            task.setAuthor(taskRequest.getAuthor());
            task.setExecutor(taskRequest.getExecutor());
            task.setTaskStatus(taskRequest.getTaskStatus());
            task.setStart(taskRequest.getStart());
            task.setEnd(taskRequest.getEnd());
            taskRepository.saveAndFlush(mapper.toDAO(taskRequest));
        }
        return mapper.toResponse(taskRequest);
    }

    @Override
    public TaskResponse statusUpdate(Long idTask, TaskRequest taskRequest) {
        Task task = taskRepository.findByIdTask(idTask);
        if (task == null) {
            throw new NotFoundException("Задача не найдена");
        } else {
            task.setTaskStatus(taskRequest.getTaskStatus());
            taskRepository.saveAndFlush(mapper.toDAO(taskRequest));
        }
        return mapper.toResponse(taskRequest);
    }

    /*@Override
    public TaskResponse taskCount(Long idProject) {
        List<Task> tasksDate = new ArrayList<>();
        tasksDate = taskRepository.findAllByEnd(idProject);

        if (true) {

        }
        else {

        }
        return null;
    }
                       Счетчик задолжностей!
     */

    @Override
    public TaskResponse projectCompletion(Long idProject) {
        return null;
    }
    @Override
    public void delete(Long idTask) {
        Task task = taskRepository.findByIdTask(idTask);
        if (task == null) {
            throw new NotFoundException("Задача не найдена");
        } else {
            taskRepository.delete(task);
        }
    }
}

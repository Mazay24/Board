package com.example.board.service.impl;

import com.example.board.Mapper.TaskMapper;
import com.example.board.dto.TaskRequest;
import com.example.board.dto.TaskResponse;
import com.example.board.enity.Task;
import com.example.board.exception.NotFoundException;
import com.example.board.repository.TaskRepository;
import com.example.board.service.TaskService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    public TaskMapper mapper = TaskMapper.INSTANCE;


    @Override
    public TaskResponse getTask(Integer idTask) {
        String notFound = String.format("Задача %d не найдена.", idTask);
        Task task = taskRepository.findByIdTask(idTask);
        if (task == null) {
            log.error(notFound);
            throw new NotFoundException(notFound);
        } else {
            return mapper.Enity(task);
        }
    }

    @Override
    public List<Task> getAllTask() {
        String notFound = "Ни одной задачи не найдено";
        if (taskRepository == null) {
            log.error(notFound);
            throw new NotFoundException(notFound);
        }
        else{
            return taskRepository.findAll();
        }
    }

    @Override
    public TaskResponse createTask(TaskRequest taskRequest) {
        String notFound = String.format("Задача %d уже существует", taskRequest.getIdTask());
        Task task = taskRepository.findByIdTask(taskRequest.getIdTask());
        if (task == null){
            taskRepository.saveAndFlush(mapper.DAO(taskRequest));
        }
        else {
            log.info(notFound);
            throw new NotFoundException(notFound);
        }
        return mapper.Response(taskRequest);
    }

    @Override
    public TaskResponse update(Integer idTask, TaskRequest taskRequest) {
        String notFound = String.format("Задача %d не найдена.", idTask);
        Task task = taskRepository.findByIdTask(idTask);
        if (task == null) {
            log.error(notFound);
            throw new NotFoundException(notFound);
        } else {
            task.setTaskName(taskRequest.getTaskName());
            task.setAuthor(taskRequest.getAuthor());
            task.setExecutor(taskRequest.getExecutor());
            task.setTaskStatus(taskRequest.getTaskStatus());
            task.setStart(taskRequest.getStart());
            task.setEnd(taskRequest.getEnd());
            taskRepository.saveAndFlush(mapper.DAO(taskRequest));
        }
        return mapper.Response(taskRequest);
    }

    @Override
    public TaskResponse statusUpdate(Integer idTask, TaskRequest taskRequest) {
        String notFound = String.format("Задача %d не найдена.", idTask);
        Task task = taskRepository.findByIdTask(idTask);
        if (task == null) {
            log.error(notFound);
            throw new NotFoundException(notFound);
        } else {
            task.setTaskStatus(taskRequest.getTaskStatus());
            taskRepository.saveAndFlush(mapper.DAO(taskRequest));
        }
        return mapper.Response(taskRequest);
    }

    /*@Override
    public TaskResponse taskCount(Integer idProject) {
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
    public TaskResponse projectCompletion(Integer idProject) {
        return null;
    }
    @Override
    public void delete(Integer idTask) {
        String notFound = String.format("Задача %d не найдена.", idTask);
        Task task = taskRepository.findByIdTask(idTask);
        if (task == null) {
            log.error(notFound);
            throw new NotFoundException(notFound);
        } else {
            taskRepository.delete(task);
        }
    }
}

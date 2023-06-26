package com.example.board.controller;

import com.example.board.dto.ReleaseRequest;
import com.example.board.dto.TaskRequest;
import com.example.board.dto.TaskResponse;
import com.example.board.service.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping("/task")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
@PutMapping("/{idTask}/Task")
    ResponseEntity<TaskResponse> updateTask(@PathVariable("idTask") Integer idTask, @Validated @RequestBody TaskRequest taskRequest) {
    return new ResponseEntity<>(taskService.update(idTask, taskRequest), HttpStatus.OK);
}
    @GetMapping("/{idTask}/getTask_name")
    ResponseEntity<TaskResponse> getTask(@PathVariable("idTask") Integer idTask){
        return new ResponseEntity<>(taskService.getTask(idTask),HttpStatus.OK);
    }
    @Operation(summary = "Создание задачи")
    @PostMapping("/task")
    ResponseEntity<TaskResponse> createTask(@Validated @RequestBody  ReleaseRequest releaseRequest, TaskRequest taskRequest) {
        return new ResponseEntity<>(taskService.createTask(taskRequest, releaseRequest), HttpStatus.CREATED);
    }
        @Operation(summary = "Удаление задачи")
        @DeleteMapping("{idTask}/task")
        ResponseEntity<?> deleteTask(@PathVariable("idTask") Integer idTask) {
            taskService.delete(idTask);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }





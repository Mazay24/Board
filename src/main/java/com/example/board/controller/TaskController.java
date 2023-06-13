package com.example.board.controller;

import com.example.board.dto.ProjectRequest;
import com.example.board.dto.TaskRequest;
import com.example.board.service.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
@PutMapping("/{name}/Task")
    ResponseEntity<?> updateTask(@PathVariable("name") String name, @Validated @RequestBody TaskRequest taskRequest) {
    return new ResponseEntity<>(taskService.update(name, taskRequest), HttpStatus.OK);
}
    @GetMapping("/{name}/getTask_name")
    ResponseEntity<?> getTask(@PathVariable("name") String name){
        return new ResponseEntity<>(taskService.getTask(name),HttpStatus.OK);
    }
    @Operation(summary = "Создание задачи")
    @PostMapping("/task")
    ResponseEntity<?> createTask(@Validated @RequestBody TaskRequest taskRequest) {
        return new ResponseEntity<>(taskService.createTask(taskRequest), HttpStatus.CREATED);
    }
        @Operation(summary = "Удаление задачи")
        @DeleteMapping("{name}/task")
        ResponseEntity<?> deleteTask(@PathVariable("name") String name) {
            taskService.delete(name);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }





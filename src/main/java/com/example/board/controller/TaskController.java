package com.example.board.controller;

import com.example.board.dto.TaskRequest;
import com.example.board.dto.TaskResponse;
import com.example.board.enity.Task;
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

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping("/task")
    ResponseEntity<List<Task>> getAllTask(){
        return ResponseEntity.ok(taskService.getAllTask());
    }
    @PutMapping("/{idTask}/tasks")
    ResponseEntity<TaskResponse> updateTask(@PathVariable("idTask") Long idTask, @Validated @RequestBody TaskRequest taskRequest) {
        return ResponseEntity.ok(taskService.update(idTask, taskRequest));
    }
    @Operation(summary = "Создание задачи")
    @PutMapping("/{idTask}/Task")
    ResponseEntity<TaskResponse> updateStatus(@PathVariable("idTask") Long idTask, @Validated @RequestBody TaskRequest taskRequest) {
        return ResponseEntity.ok(taskService.statusUpdate(idTask, taskRequest));
    }
    @GetMapping("/{idTask}/getTask_name")
    ResponseEntity<TaskResponse> getTask(@PathVariable("idTask") Long idTask){
        return ResponseEntity.ok(taskService.getTask(idTask));
    }
    @Operation(summary = "Создание задачи")
    @PostMapping("/task")
    ResponseEntity<TaskResponse> createTask(@Validated @RequestBody  TaskRequest taskRequest) {
        return ResponseEntity.ok(taskService.createTask(taskRequest));
    }
    @Operation(summary = "Удаление задачи")
    @DeleteMapping("{idTask}/task")
    ResponseEntity<?> deleteTask(@PathVariable("idTask") Long idTask) {
        taskService.delete(idTask);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    /*@PutMapping("/{idProject}/Task")
    ResponseEntity<TaskResponse> taskCount(@PathVariable("idProject") Long idProject){
        return ResponseEntity.ok(taskService.taskCount(idProject));
    }
     */
}





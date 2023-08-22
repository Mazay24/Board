package com.example.board.controller;

import com.example.board.dto.TaskRequest;
import com.example.board.dto.TaskResponse;
import com.example.board.enity.Task;
import com.example.board.service.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
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
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping("/task")
    ResponseEntity<List<Task>> getAllTask(){
        return ResponseEntity.ok(taskService.getAllTask());
    }
    @PutMapping("/task/{idTask}")
    ResponseEntity<TaskResponse> updateTask(@PathVariable("idTask") Integer idTask, @Validated @RequestBody TaskRequest taskRequest) {
        return ResponseEntity.ok(taskService.update(idTask, taskRequest));
    }
    @Operation(summary = "Создание задачи")
    @PutMapping("/task-status/{idTask}")
    ResponseEntity<TaskResponse> updateStatus(@PathVariable("idTask") Integer idTask, @Validated @RequestBody TaskRequest taskRequest) {
        return ResponseEntity.ok(taskService.statusUpdate(idTask, taskRequest));
    }
    @GetMapping("/info-task/{idTask}")
    ResponseEntity<TaskResponse> getTask(@PathVariable("idTask") Integer idTask){
        return ResponseEntity.ok(taskService.getTask(idTask));
    }
    @Operation(summary = "Создание задачи")
    @PostMapping("/task")
    ResponseEntity<TaskResponse> createTask(@Validated @RequestBody  TaskRequest taskRequest) {
        return ResponseEntity.ok(taskService.createTask(taskRequest));
    }
    @Operation(summary = "Удаление задачи")
    @DeleteMapping("/task/{idTask}")
    ResponseEntity<?> deleteTask(@PathVariable("idTask") Integer idTask) {
        taskService.delete(idTask);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    /*@PutMapping("/task/{idProject}")
    ResponseEntity<TaskResponse> taskCount(@PathVariable("idProject") Integer idProject){
        return ResponseEntity.ok(taskService.taskCount(idProject));
    }
     */
}





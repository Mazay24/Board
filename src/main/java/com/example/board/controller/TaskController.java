package com.example.board.controller;

import com.example.board.dto.TaskRequest;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/task")
public class TaskController {
    @GetMapping("/getTask_name")
    ResponseEntity<?> getTask(){
        return null;
    }
    @Operation(summary = "Создание задачи")
    @PostMapping("/task")
    ResponseEntity<?> createTask(@Validated @RequestBody TaskRequest taskRequest) {
        return null;
    }
        @Operation(summary = "Удаление задачи")
        @DeleteMapping("/task")
        ResponseEntity<?> deleteTask() {
            return null;
        }
    }





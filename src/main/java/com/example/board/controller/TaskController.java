package com.example.board.controller;

import com.example.board.DTO.TaskRequest;
import com.example.board.Status;
import io.swagger.v3.oas.annotations.Operation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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





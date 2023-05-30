package com.example.board.controller;

import com.example.board.DTO.BoardRequest;
import com.example.board.DTO.BoardResponse;
import com.example.board.Status;
import io.swagger.v3.oas.annotations.Operation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/info-board")
    ResponseEntity<?> getTask() {
        return null;
    }
    @Operation(summary = "Создание задач")
    @PostMapping("/task")
    ResponseEntity<?> postIdtask(@Validated @RequestBody BoardRequest boardRequest) {
        return null;
    }
    @DeleteMapping("/task")
    ResponseEntity<?> deleteTask(){
        return null;
    }

}

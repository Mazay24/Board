package com.example.board.controller;

import com.example.board.dto.BoardRequest;
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

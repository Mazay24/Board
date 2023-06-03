package com.example.board.controller;

import com.example.board.DTO.ProjectRequest;
import com.example.board.Status;
import io.swagger.v3.oas.annotations.Operation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/project")
public class ProjectController {
    @GetMapping("/info-project)")
    ResponseEntity<?> getProject(){
        return null;
    }
    @Operation(summary = "Создание проекта")
    @PostMapping("/info-project")
    ResponseEntity<?> createProject(@Validated @RequestBody ProjectRequest projectRequest){
        return null;
    }
    @Operation(summary = "Удаление проекта")
    @DeleteMapping("/project")
    ResponseEntity<?> deleteProject(){
        return null;
    }
}

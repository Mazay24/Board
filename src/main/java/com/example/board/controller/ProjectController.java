package com.example.board.controller;

import com.example.board.dto.ProjectRequest;
import com.example.board.service.ProjectService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/{name}/info-project)")
    ResponseEntity<?> getProject(@PathVariable("name") String name){
        return new ResponseEntity<>(projectService.getProject(name),HttpStatus.OK);
    }
    @Operation(summary = "Создание проекта")
    @PostMapping("/info-project")
    ResponseEntity<?> createProject(@Validated @RequestBody ProjectRequest projectRequest){
        return new ResponseEntity<>(projectService.createProject(projectRequest), HttpStatus.CREATED);
    }
    @Operation(summary = "Редактирование проекта")
    @PutMapping("/{name}/project")
    ResponseEntity<?> updateProject(@PathVariable("name") String name, @Validated @RequestBody ProjectRequest projectRequest){
        return new ResponseEntity<>(projectService.update(name, projectRequest), HttpStatus.OK);
    }
    @Operation(summary = "Удаление проекта")
    @DeleteMapping("/{name}/project")
    ResponseEntity<?> deleteProject(@PathVariable("name") String name){
        projectService.delete(name);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

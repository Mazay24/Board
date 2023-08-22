package com.example.board.controller;

import com.example.board.dto.ProjectRequest;
import com.example.board.dto.ProjectResponse;
import com.example.board.enity.Authentication;
import com.example.board.service.ProjectService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
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
@RequestMapping("/projects")
@RequiredArgsConstructor
public class ProjectController {
    private final ProjectService projectService;

    @GetMapping("/info-project)/{idProject}")
    ResponseEntity<ProjectResponse> getProject(@PathVariable("idProject") Integer idProject){
        return ResponseEntity.ok(projectService.getProject(idProject));
    }
    @Operation(summary = "Создание проекта")
    @PostMapping("/info-project")
    ResponseEntity<ProjectResponse> createProject(@Validated @RequestBody ProjectRequest projectRequest, @AuthenticationPrincipal Authentication idUser){
        return ResponseEntity.ok(projectService.createProject(projectRequest, idUser));

    }
    @Operation(summary = "Редактирование проекта")
    @PutMapping("/project/{idProject}")
    ResponseEntity<ProjectResponse> updateProject(@PathVariable("idProject") Integer idProject, @Validated @RequestBody ProjectRequest projectRequest){
        return ResponseEntity.ok(projectService.update(idProject, projectRequest));
    }
    @Operation(summary = "Удаление проекта")
    @DeleteMapping("/project/{idProject}")
    ResponseEntity<?> deleteProject(@PathVariable("idProject") Integer idProject){
        projectService.delete(idProject);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}

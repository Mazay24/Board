package com.example.board.service.impl;

import com.example.board.dto.ProjectRequest;
import com.example.board.dto.ProjectResponse;
import com.example.board.enity.Project;
import com.example.board.exception.Code;
import com.example.board.exception.CommonException;
import com.example.board.repository.ProjectRepository;
import com.example.board.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public ProjectResponse createProject(ProjectRequest projectRequest) {
        Project project = projectRepository.findByProjectName(projectRequest.getProjectName());
        if (project == null){
            projectRepository.saveAndFlush(projectRequest.toDAO());
        }
        else {
            System.out.println("Такой проект уже существует");
            throw CommonException.builder().code(Code.PROJECT_ERROR).message("Проект с таким названием уже существует.").httpStatus(HttpStatus.BAD_REQUEST).build();

        }
        return new ProjectResponse(projectRequest.getProjectAuthor(), projectRequest.getProjectName(), projectRequest.getProjectDescription(), projectRequest.getProjectStatus());
    }


    @Override
    public ProjectResponse getProject(String name) {
        Project project = projectRepository.findByProjectName(name);
        if (project == null) {
            throw CommonException.builder().code(Code.PROJECT_ERROR).message("Проект с таким названием не найден").httpStatus(HttpStatus.BAD_REQUEST).build();
        } else {
            System.out.println(project);

        }
        return new ProjectResponse(project.getProjectAuthor(), project.getProjectName(), project.getProjectDescription(), project.getProjectStatus());
    }

    @Override
    public void delete(String name) {
        Project project = projectRepository.findByProjectName(name);
        if (project == null) {
            throw CommonException.builder().code(Code.PROJECT_ERROR).message("Проект с таким названием не найден").httpStatus(HttpStatus.BAD_REQUEST).build();
        }
        else {
            projectRepository.delete(project);
        }

    }

    @Override
    public ProjectResponse update(String name, ProjectRequest projectRequest) {
        Project project = projectRepository.findByProjectName(name);
        if (project == null) {
            throw CommonException.builder().code(Code.PROJECT_ERROR).message("Проект с таким названием не найден").httpStatus(HttpStatus.BAD_REQUEST).build();

        }
        else {
            projectRepository.delete(project);
            projectRepository.saveAndFlush(projectRequest.toDAO());
        }
        return new ProjectResponse(projectRequest.getProjectAuthor(), projectRequest.getProjectName(), projectRequest.getProjectDescription(), projectRequest.getProjectStatus());
    }
    }




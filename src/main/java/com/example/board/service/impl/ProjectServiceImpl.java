package com.example.board.service.impl;

import com.example.board.Mapper.ProjectMapper;
import com.example.board.dto.ProjectRequest;
import com.example.board.dto.ProjectResponse;
import com.example.board.enity.Project;
import com.example.board.exception.NotFoundException;
import com.example.board.repository.ProjectRepository;
import com.example.board.service.ProjectService;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;
    private final ProjectMapper mapper = ProjectMapper.INSTANCE;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public ProjectResponse createProject(ProjectRequest projectRequest){
        Project project = projectRepository.findByIdProject(projectRequest.getIdProject());
        if (project == null){
            projectRepository.saveAndFlush(mapper.toDAO(projectRequest));
        }
        else {
            System.out.println("Такой проект уже существует");
            throw new NotFoundException("Проект уже существует");
        }
        return mapper.toResponse(projectRequest);
    }

    @Override
    public ProjectResponse getProject(Long idProject) {
        Project project = projectRepository.findByIdProject(idProject);
        if (project == null) {
            throw new NotFoundException("Проект не существует");
        } else {
            System.out.println(project);
        }
        return mapper.fromEnity(project);
    }

    @Override
    public void delete(Long idProject) {
        Project project = projectRepository.findByIdProject(idProject);
        if (project == null) {
            throw new NotFoundException("Проект не существует");
        }
        else {
            projectRepository.delete(project);
        }
    }

    @Override
    public ProjectResponse update(Long idProject, ProjectRequest projectRequest) {
        Project project = projectRepository.findByIdProject(idProject);
        if (project == null) {
            throw new NotFoundException("Проект не существует");
        }
        else {
            int allTask = project.getAllTasks() + 1;
            int debt = project.getDebt();
            project.setAllTasks(allTask);
            projectRepository.delete(project);
            projectRepository.saveAndFlush(mapper.toDAO(projectRequest));
        }
            return mapper.toResponse(projectRequest);
    }
}




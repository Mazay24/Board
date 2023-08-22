package com.example.board.service.impl;

import com.example.board.Mapper.ProjectMapper;
import com.example.board.dto.ProjectRequest;
import com.example.board.dto.ProjectResponse;
import com.example.board.enity.Authentication;
import com.example.board.enity.Project;
import com.example.board.exception.NotFoundException;
import com.example.board.repository.ProjectRepository;
import com.example.board.service.ProjectService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProjectServiceImpl implements ProjectService {
    private final ProjectRepository projectRepository;
    private final ProjectMapper mapper = ProjectMapper.INSTANCE;

    @Override
    public ProjectResponse createProject(ProjectRequest projectRequest, Authentication idUser){
        String exists = String.format("Проект %d уже сущесвует", projectRequest.getIdProject());
        Project project = projectRepository.findByIdProject(projectRequest.getIdProject());
        if (project == null){
            projectRepository.saveAndFlush(mapper.DAO(projectRequest));
        }
        else {
            log.error(exists);
            throw new NotFoundException(exists);
        }
        return mapper.Response(projectRequest);
    }

    @Override
    public ProjectResponse getProject(Integer idProject) {
        String notFound = String.format("Проект %d не сущесвует", idProject);
        Project project = projectRepository.findByIdProject(idProject);
        if (project == null) {
            log.error(notFound);
            throw new NotFoundException(notFound);
        } else {
            return mapper.Enity(project);
        }
    }

    @Override
    public void delete(Integer idProject) {
        String notFound = String.format("Проект %d не сущесвует", idProject);
        Project project = projectRepository.findByIdProject(idProject);
        if (project == null) {
            log.error(notFound);
            throw new NotFoundException(notFound);
        }
        else {
            projectRepository.delete(project);
        }    }

    @Override
    public ProjectResponse update(Integer idProject, ProjectRequest projectRequest) {
        String notFound = String.format("Проект %d не сущесвует", idProject);
        Project project = projectRepository.findByIdProject(idProject);
        if (project == null) {
            log.error(notFound);
            throw new NotFoundException(notFound);
        }
        else {
            int allTask = project.getAllTasks() + 1;
            int debt = project.getDebt();
            project.setAllTasks(allTask);
            projectRepository.delete(project);
            projectRepository.saveAndFlush(mapper.DAO(projectRequest));
        }
            return mapper.Response(projectRequest);
    }
}




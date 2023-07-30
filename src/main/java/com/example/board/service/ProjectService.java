package com.example.board.service;

import com.example.board.dto.ProjectRequest;
import com.example.board.dto.ProjectResponse;

public interface ProjectService {
    ProjectResponse createProject(ProjectRequest projectRequest);
    ProjectResponse getProject(Long idProject);
    void delete(Long idProject);
    ProjectResponse update(Long idProject, ProjectRequest projectRequest);
}

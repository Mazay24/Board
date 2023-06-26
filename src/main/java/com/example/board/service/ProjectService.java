package com.example.board.service;

import com.example.board.dto.ProjectRequest;
import com.example.board.dto.ProjectResponse;

public interface ProjectService {
    ProjectResponse createProject(ProjectRequest projectRequest);
    ProjectResponse getProject(Integer idProject);
    void delete(Integer idProject);
    ProjectResponse update(Integer idProject, ProjectRequest projectRequest);
}

package com.example.board.service;

import com.example.board.dto.ProjectRequest;
import com.example.board.dto.ProjectResponse;
import com.example.board.enity.Authentication;

public interface ProjectService {
    ProjectResponse createProject(ProjectRequest projectRequest, Authentication idUser);
    ProjectResponse getProject(Integer idProject);
    void delete(Integer idProject);
    ProjectResponse update(Integer idProject, ProjectRequest projectRequest);
}

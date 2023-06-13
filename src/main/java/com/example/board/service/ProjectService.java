package com.example.board.service;

import com.example.board.dto.BoardRequest;
import com.example.board.dto.ProjectRequest;
import com.example.board.dto.ProjectResponse;

public interface ProjectService {
    ProjectResponse createProject(ProjectRequest projectRequest);
    ProjectResponse getProject(String name);
    void delete(String name);
    ProjectResponse update(String name, ProjectRequest projectRequest);
}

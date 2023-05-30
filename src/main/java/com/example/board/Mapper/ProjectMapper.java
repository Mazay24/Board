package com.example.board.Mapper;

import com.example.board.DTO.BoardRequest;
import com.example.board.DTO.BoardResponse;
import com.example.board.DTO.ProjectRequest;
import com.example.board.DTO.ProjectResponse;
import com.example.board.enity.Board;
import com.example.board.enity.Project;
import org.mapstruct.Mapper;

@Mapper
public interface ProjectMapper {
    ProjectRequest fromRequestToResponse(ProjectResponse projectResponse);

    ProjectResponse fromResponseToRequest(ProjectRequest projectRequest);

    Project fromEntityToRequest(ProjectRequest projectRequest);

    Project fromEntityToResponse(ProjectResponse projectResponse);

    ProjectRequest fromRequestToEntity(Project project);

    ProjectResponse fromResponseToEntity(Project project);
}

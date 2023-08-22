package com.example.board.Mapper;

import com.example.board.dto.ProjectRequest;
import com.example.board.dto.ProjectResponse;
import com.example.board.enity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProjectMapper {
    ProjectMapper INSTANCE = Mappers.getMapper(ProjectMapper.class);
    Project DAO(ProjectRequest projectRequest);
    ProjectResponse Response(ProjectRequest projectRequest);
    ProjectResponse Enity(Project project);
}

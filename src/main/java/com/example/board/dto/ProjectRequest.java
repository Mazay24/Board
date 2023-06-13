package com.example.board.dto;

import com.example.board.Status;
import com.example.board.enity.Authentication;
import com.example.board.enity.Project;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class ProjectRequest {
    @Schema(description = "Автор проекта")
    @NonNull
    private String projectAuthor;
    @Schema(description = "Название проекта")
    @NonNull
    private String projectName;
    @Schema(description = "Описание проекта")
    @NonNull
    private String projectDescription;
    @Schema(description = "Статус проекта")
    @NonNull
    private Status projectStatus;
    public Project toDAO(){
        return new Project(null, projectAuthor, projectName, projectDescription, projectStatus);
    }

    public String getProjectAuthor(String name) {
        return projectAuthor;
    }
}

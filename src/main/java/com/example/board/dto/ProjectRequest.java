package com.example.board.dto;

import com.example.board.enums.Status;
import com.example.board.enity.Project;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
@Data

@Getter
@Setter
public class ProjectRequest {
    @NonNull
    private Integer idProject;
    @Schema(description = "Автор проекта")
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
}

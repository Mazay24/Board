package com.example.board.DTO;

import com.example.board.Status;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class ProjectRequest {
    @Schema(description = "ID проекта")
    @NonNull
    private int idProject;
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
}

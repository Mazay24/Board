package com.example.board.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BoardResponse {
    @Schema(description = "ID проекта")
    @NonNull
    private String nameProject;
    private int allTasks;
    private int debt;
}

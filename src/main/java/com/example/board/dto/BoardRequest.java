package com.example.board.dto;

import com.example.board.enity.Board;
import com.example.board.enity.Project;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class BoardRequest {
    @Schema(description = "ID проекта")
    @NonNull
    private String nameProject;
    @Schema(description = "Количество задач")
    @NonNull
    @Max(100)
    private Integer allTasks;
    @Schema(description = "Задолжности")
    @NonNull
    private Integer debt;
    public Board toDAO(){
        return new Board(nameProject, allTasks, debt);
    }
}

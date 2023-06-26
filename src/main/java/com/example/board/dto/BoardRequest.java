package com.example.board.dto;

import com.example.board.enity.Board;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class BoardRequest {
    @NonNull
    private Integer idProject;
    @Schema(description = "Количество задач")
    @NonNull
    @Max(100)
    private Integer allTasks;
    @Schema(description = "Задолжности")
    @NonNull
    private Integer debt;

    public void setAllInfo(Integer idProject, Integer allTasks, Integer debt) {
        this.idProject = idProject;
        this.allTasks = allTasks;
        this.debt = debt;
    }
}

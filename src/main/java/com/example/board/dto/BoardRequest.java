package com.example.board.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class BoardRequest {
    @Schema(description = "ID задач")
    @NonNull
    @Min(0)
    private int idTask;
    @Schema(description = "Количество задач")
    @NonNull
    @Max(100)
    private int allTasks;
    @Schema(description = "Задолжности")
    @NonNull
    private int debt;
}

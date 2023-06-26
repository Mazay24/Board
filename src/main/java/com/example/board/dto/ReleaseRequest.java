package com.example.board.dto;

import com.example.board.enity.Task;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Date;
@Data
@Getter
@Setter
public class ReleaseRequest {
    @Schema(description = "Id задачи")
    @NonNull
    private Integer idTask;
    @Schema(description = "Начало задачи")
    @NonNull
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date start;
    @Schema(description = "Конец задачи")
    @NonNull
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date end;
}

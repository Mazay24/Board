package com.example.board.dto;

import com.example.board.enity.Release;
import com.example.board.enums.Status;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class TaskRequest {
    @Schema(description = "ID задачи")
    @NonNull
    private Integer idTask;
    @Schema(description = "Название задачи")
    @NonNull
    private String taskName;
    @Schema(description = "Автор")
    @NonNull
    private String author;
    @Schema(description = "Исполнитель")
    @NonNull
    private String executor;
    @Schema(description = "Статус задачи")
    @NonNull
    private Status taskStatus;

}


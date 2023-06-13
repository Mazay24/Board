package com.example.board.dto;

import com.example.board.Status;
import com.example.board.enity.Task;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class TaskRequest {
    @Schema(description = "Название задачи")
    @NonNull
    private String taskName;
    @Schema(description = "Исполнитель")
    @NonNull
    private String executor;
    @Schema(description = "Статус задачи")
    @NonNull
    private Status taskStatus;

    public Task toDAO() {
        return new Task(null, taskName, executor, taskStatus);
    }
}


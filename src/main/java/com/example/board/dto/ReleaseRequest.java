package com.example.board.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.text.DateFormat;

@Getter
@Setter
public class ReleaseRequest {
    @Schema(description = "Начало задачи")
    @NonNull
    private DateFormat start;
    @Schema(description = "Конец задачи")
    @NonNull
    private DateFormat end;
}

package com.example.board.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.text.DateFormat;
import java.util.Date;
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

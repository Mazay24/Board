package com.example.board.dto;

import com.example.board.enity.Project;
import com.example.board.enity.Realease;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.text.DateFormat;
import java.util.Date;

@Getter
@Setter
public class ReleaseRequest {
    @Schema(description = "Название задачи")
    @NonNull
    private String taskName;
    @Schema(description = "Начало задачи")
    @NonNull
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date start;
    @Schema(description = "Конец задачи")
    @NonNull
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date end;
    public Realease toDAO(){
        return new Realease(taskName, start, end);
    }
}

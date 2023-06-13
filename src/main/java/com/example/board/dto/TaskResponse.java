package com.example.board.dto;

import com.example.board.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TaskResponse {
    private String taskName;
    private String executor;
    private Status taskStatus;
}


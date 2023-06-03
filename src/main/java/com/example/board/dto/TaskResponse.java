package com.example.board.dto;

import com.example.board.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskResponse {
    private String taskName;
    private String executor;
    private Status taskStatus;
}


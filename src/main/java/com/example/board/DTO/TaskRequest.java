package com.example.board.DTO;

import com.example.board.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskRequest {
    private String taskName;
    private String executor;
    private Status taskStatus;
}


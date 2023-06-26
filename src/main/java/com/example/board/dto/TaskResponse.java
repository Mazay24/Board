package com.example.board.dto;

import com.example.board.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data

@Getter
@Setter
@AllArgsConstructor
public class TaskResponse {
    private Integer idTask;
    private String taskName;
    private String author;
    private String executor;
    private Status taskStatus;

}


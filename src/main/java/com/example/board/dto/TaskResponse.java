package com.example.board.dto;

import com.example.board.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskResponse {
    private Integer idTask;
    private String taskName;
    private String author;
    private String executor;
    private Status taskStatus;
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date start;
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date end;
}


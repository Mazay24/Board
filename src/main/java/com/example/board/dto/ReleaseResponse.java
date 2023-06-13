package com.example.board.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.text.DateFormat;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ReleaseResponse {
    private String taskName;
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date start;
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date end;
}

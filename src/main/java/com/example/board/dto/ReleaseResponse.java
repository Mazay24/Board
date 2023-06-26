package com.example.board.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Data

@Getter
@Setter
@AllArgsConstructor
public class ReleaseResponse {
    private Integer idTask;
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date start;
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date end;

}
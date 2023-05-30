package com.example.board.DTO;

import lombok.Getter;
import lombok.Setter;

import java.text.DateFormat;
import java.util.Date;
@Getter
@Setter
public class ReleaseRequest {
    private DateFormat start;
    private DateFormat end;

}

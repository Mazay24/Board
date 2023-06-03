package com.example.board.dto;

import lombok.Getter;
import lombok.Setter;

import java.text.DateFormat;

@Getter
@Setter
public class ReleaseResponse {
    private DateFormat start;
    private DateFormat end;
}

package com.example.board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data

@Getter
@Setter
@AllArgsConstructor
public class BoardResponse {
    private int allTasks;
    private int debt;
}

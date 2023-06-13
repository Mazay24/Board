package com.example.board.dto;

import com.example.board.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProjectResponse {
    private String projectAuthor;
    private String projectName;
    private String projectDescription;
    private Status projectStatus;


}

package com.example.board.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectRequest {
    private int idProject;
    private String projectAuthor;
    private String projectName;
    private String projectDescription;
    private String projectStatus;

}

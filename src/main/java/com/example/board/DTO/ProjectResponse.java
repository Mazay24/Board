package com.example.board.DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Getter
@Setter
public class ProjectResponse {
    private int idProject;
    private String projectAuthor;
    private String projectName;
    private String projectDescription;
    private String projectStatus;
}

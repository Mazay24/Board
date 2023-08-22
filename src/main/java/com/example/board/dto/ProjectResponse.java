package com.example.board.dto;

import com.example.board.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectResponse {
    private String projectAuthor;
    private String projectName;
    private String projectDescription;
    private Status projectStatus;
    private Integer allTasks;
    private Integer debt;
}

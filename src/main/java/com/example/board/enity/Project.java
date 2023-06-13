package com.example.board.enity;

import com.example.board.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Project")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_project")
    private Integer idProject;
    @Column(name = "Project_autor", nullable = false)
    private String projectAuthor;
    @Column(name = "Project_name", nullable = false)
    private String projectName;
    @Column(name = "Project_description", nullable = false)
    private String projectDescription;
    @Column(name = "Project_status", nullable = false)
    private Status projectStatus;
}

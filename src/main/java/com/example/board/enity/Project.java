package com.example.board.enity;

import com.example.board.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "project")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_project")
    private Integer idProject;
    @Column(name = "project_autor", nullable = false)
    private String projectAuthor;
    @Column(name = "project_name", nullable = false)
    private String projectName;
    @Column(name = "project_description", nullable = false)
    private String projectDescription;
    @Column(name = "project_status", nullable = false)
    private Status projectStatus;
}

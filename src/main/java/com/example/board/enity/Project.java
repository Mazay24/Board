package com.example.board.enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Project")
public class Project {
    @Id
    @Column(name = "IDproject", nullable = false)
    private int id_project;
    @Column(name = "ProjectAutor", nullable = false)
    private String project_author;
    @Column(name = "ProjectName", nullable = false)
    private String project_name;
    @Column(name = "ProjectDescription", nullable = false)
    private String project_description;
    @Column(name = "ProjectStatus", nullable = false)
    private String project_status;

    public Project() {
    }

    public void setId_project(int id_project) {
        this.id_project = id_project;
    }

    public void setProject_author(String project_author) {
        this.project_author = project_author;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public void setProject_description(String project_description) {
        this.project_description = project_description;
    }

    public void setProject_status(String project_status) {
        this.project_status = project_status;
    }

    public int getId_project() {
        return id_project;
    }

    public String getProject_author() {
        return project_author;
    }

    public String getProject_name() {
        return project_name;
    }

    public String getProject_description() {
        return project_description;
    }

    public String getProject_status() {
        return project_status;
    }
}

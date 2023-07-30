package com.example.board.enity;

import com.example.board.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.FetchType;

@Entity
@Table(name = "project")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_project")
    private Long idProject;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user")
    private Authentication idUser;
    @Column(name = "project_author", nullable = false)
    private String projectAuthor;
    @Column(name = "project_name", nullable = false)
    private String projectName;
    @Column(name = "project_description", nullable = false)
    private String projectDescription;
    @Column(name = "project_status", nullable = false)
    private Status projectStatus;
    @Column(name = "all_tasks", nullable = false)
    private Integer allTasks;
    @Column(name = "debt", nullable = false)
    private Integer debt;
}

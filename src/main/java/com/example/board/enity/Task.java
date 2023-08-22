package com.example.board.enity;

import com.example.board.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
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
import java.util.Date;


@Entity
@Table(name = "task")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @Column(name = "id_tasks", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTask;
    @Column(name = "id_project")
    private Integer idProject;
    @Column(name = "task_name", nullable = false)
    private String taskName;
    @Column(name = "author", nullable = true)
    private String author;
    @Column(name = "executor", nullable = false)
    private String executor;
    @Column(name = "task_status", nullable = false)
    private Status taskStatus;
    @Column(name = "start", nullable = false)
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date start;
    @Column(name = "finish", nullable = false)
    @JsonFormat(pattern="dd-MM-yyyy")
    private Date end;
}

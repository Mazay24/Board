package com.example.board.enity;

import com.example.board.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Task")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    @Column(name = "ID_tasks", nullable = false)
    private int idTask;
    @Column(name = "Task_name", nullable = false)
    private String taskName;
    @Column(name = "Executor", nullable = false)
    private String executor;
    @Column(name = "Task_status", nullable = false)
    private Status taskStatus;


}

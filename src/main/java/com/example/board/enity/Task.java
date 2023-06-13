package com.example.board.enity;

import com.example.board.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Task")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @Column(name = "ID_tasks", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTask;
    @Column(name = "Task_name", nullable = false)
    private String taskName;
    @Column(name = "Executor", nullable = false)
    private String executor;
    @Column(name = "Task_status", nullable = false)
    private Status taskStatus;
}

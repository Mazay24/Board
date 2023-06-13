package com.example.board.enity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Board")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    @Id
    @Column(name = "Project_name", nullable = false)
    private String nameProject;
    @Column(name = "All_tasks", nullable = false)
    private Integer allTasks;
    @Column(name = "Debt", nullable = false)
    private Integer debt;
}

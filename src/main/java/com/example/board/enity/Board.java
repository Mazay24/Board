package com.example.board.enity;

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
@Table(name = "board")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class    Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProject;
    @Column(name = "all_tasks", nullable = false)
    private Integer allTasks;
    @Column(name = "debt", nullable = false)
    private Integer debt;
}

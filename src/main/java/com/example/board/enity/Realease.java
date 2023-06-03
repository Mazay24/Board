package com.example.board.enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.DateFormat;
import java.util.Date;

@Entity
@Table(name = "Realease")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Realease {
    @Id
    @Column(name = "ID_tasks", nullable = false)
    private int idTask;
    @Column(name = "Start", nullable = false)
    private DateFormat start;
    @Column(name = "Finish", nullable = false)
    private DateFormat end;
}

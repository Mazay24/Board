package com.example.board.enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Realease")
public class Realease {
    @Id
    @Column(name = "IDtasks", nullable = false)
    private int id_task;
    @Column(name = "Start", nullable = false)
    private Date start;

    public void setId_task(int id_task) {
        this.id_task = id_task;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public int getId_task() {
        return id_task;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public Realease() {
    }

    @Column(name = "End", nullable = false)
    private Date end;
}

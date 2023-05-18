package com.example.board.enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Board")
public class Board {
    @Id
    @Column(name = "IDproject", nullable = false)
    private int id_project;
    @Column(name = "IDtasks", nullable = false)
    private int id_task;
    @Column(name = "Alltasks", nullable = false)
    private int all_tasks;
    @Column(name = "Debt", nullable = false)
    private int debt;

    public Board() {
    }

    public void setId_project(int id_project) {
        this.id_project = id_project;
    }

    public void setId_task(int id_task) {
        this.id_task = id_task;
    }

    public void setAll_tasks(int all_tasks) {
        this.all_tasks = all_tasks;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public int getId_project() {
        return id_project;
    }

    public int getId_task() {
        return id_task;
    }

    public int getAll_tasks() {
        return all_tasks;
    }

    public int getDebt() {
        return debt;
    }
}

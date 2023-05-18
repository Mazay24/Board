package com.example.board.enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Task")
public class Task {
    @Id
    @Column(name = "IDtasks", nullable = false)
    private int id_task;
    @Column(name = "TaskName", nullable = false)
    private String task_name;
    @Column(name = "Executor", nullable = false)
    private String executor;
    @Column(name = "TaskStatus", nullable = false)
    private String task_status;

    public Task() {
    }

    public void setId_task(int id_task) {
        this.id_task = id_task;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public void setTask_status(String task_status) {
        this.task_status = task_status;
    }

    public int getId_task() {
        return id_task;
    }

    public String getTask_name() {
        return task_name;
    }

    public String getExecutor() {
        return executor;
    }

    public String getTask_status() {
        return task_status;
    }
}

package com.example.board;


import java.util.Date;

public class Data {
    private String fi;
    private String login;
    private  String password;
    private int id_project;
    private String project_author;
    private String project_name;
    private String project_description;
    private String project_status;
    private int id_task;
    private int all_tasks;
    private int debt;
    private String task_name;
    private String executor;
    private String task_status;
    private Date start;
    private Date end;

    public void setFi(String fi) {
        this.fi = fi;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId_project(int id_project) {
        this.id_project = id_project;
    }

    public void setProject_author(String project_author) {
        this.project_author = project_author;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public void setProject_description(String project_description) {
        this.project_description = project_description;
    }

    public void setProject_status(String project_status) {
        this.project_status = project_status;
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

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public void setTask_status(String task_status) {
        this.task_status = task_status;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getFi() {
        return fi;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getId_project() {
        return id_project;
    }

    public String getProject_author() {
        return project_author;
    }

    public String getProject_name() {
        return project_name;
    }

    public String getProject_description() {
        return project_description;
    }

    public String getProject_status() {
        return project_status;
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

    public String getTask_name() {
        return task_name;
    }

    public String getExecutor() {
        return executor;
    }

    public String getTask_status() {
        return task_status;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }
}

package DTO;

public class TaskRequest {
    private String task_name;
    private String executor;
    private String task_status;

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public void setTask_status(String task_status) {
        this.task_status = task_status;
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


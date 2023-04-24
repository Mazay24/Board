package DTO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TaskResponse {
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
    @PostMapping("/Task")
    public ResponseEntity<TaskResponse> createProduct(
            @RequestBody TaskRequest request) {
        return null;
    }
}


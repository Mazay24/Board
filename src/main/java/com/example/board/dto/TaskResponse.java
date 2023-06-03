package com.example.board.DTO;

import com.example.board.Status;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Getter
@Setter
public class TaskResponse {
    private String taskName;
    private String executor;
    private Status taskStatus;
}


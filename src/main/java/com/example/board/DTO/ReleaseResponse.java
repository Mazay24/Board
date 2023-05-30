package com.example.board.DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.text.DateFormat;
import java.util.Date;
@Getter
@Setter
public class ReleaseResponse {
    private DateFormat start;
    private DateFormat end;
}

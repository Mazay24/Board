package com.example.board.DTO;


import lombok.Getter;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class AuthorizationResponse {
    private String fullName;
    private String login;
}

package com.example.board.DTO;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Setter
@Getter
public class AuthorizationRequest {
    private String fullName;
    private String login;
    private String password;
}

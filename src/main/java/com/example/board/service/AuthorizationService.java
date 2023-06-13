package com.example.board.service;

import com.example.board.dto.AuthorizationRequest;
import com.example.board.dto.AuthorizationResponse;
import org.springframework.http.ResponseEntity;

public interface AuthorizationService {
    AuthorizationResponse getUser(String login);
    AuthorizationResponse createUser(AuthorizationRequest authorizationRequest);
    AuthorizationResponse update(String login, AuthorizationRequest authorizationRequest);
    public void delete(String login);
}

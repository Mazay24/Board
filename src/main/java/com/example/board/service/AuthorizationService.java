package com.example.board.service;

import com.example.board.dto.AuthorizationRequest;
import org.springframework.http.ResponseEntity;

public interface AuthorizationService {
    ResponseEntity<?> getUser(String login);
    ResponseEntity<?> createUser(AuthorizationRequest authorizationRequest);
    ResponseEntity<?> update(String login, AuthorizationRequest authorizationRequest);
    ResponseEntity<?> delete(String login);
}

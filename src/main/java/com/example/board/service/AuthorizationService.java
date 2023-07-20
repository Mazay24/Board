package com.example.board.service;

import com.example.board.dto.AuthorizationRequest;
import com.example.board.dto.AuthorizationResponse;
import com.example.board.dto.ProjectRequest;

public interface AuthorizationService {
    AuthorizationResponse getUser(Long idUser);
    AuthorizationResponse createUser(AuthorizationRequest authorizationRequest, ProjectRequest projectRequest);
    AuthorizationResponse update(Long idUser, AuthorizationRequest authorizationRequest);
    void delete(Long idUser);
    String autoreg(String login, String password);
}

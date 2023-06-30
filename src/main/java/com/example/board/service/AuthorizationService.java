package com.example.board.service;

import com.example.board.dto.AuthorizationRequest;
import com.example.board.dto.AuthorizationResponse;
import com.example.board.dto.ProjectRequest;

public interface AuthorizationService {
    AuthorizationResponse getUser(Integer idUser);
    AuthorizationResponse createUser(AuthorizationRequest authorizationRequest, ProjectRequest projectRequest);
    AuthorizationResponse update(Integer idUser, AuthorizationRequest authorizationRequest);
    void delete(Integer idUser);
    String autoreg(String login, String password);
}

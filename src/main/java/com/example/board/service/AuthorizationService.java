package com.example.board.service;

import com.example.board.dto.AuthorizationRequest;
import com.example.board.dto.AuthorizationResponse;

public interface AuthorizationService {
    AuthorizationResponse getUser(Integer idUser);
    AuthorizationResponse createUser(AuthorizationRequest authorizationRequest);
    AuthorizationResponse update(Integer idUser, AuthorizationRequest authorizationRequest);
    void delete(Integer idUser);
}

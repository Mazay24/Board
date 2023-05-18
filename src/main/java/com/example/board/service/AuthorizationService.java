package com.example.board.service;

import com.example.board.enity.Authorization;

public interface AuthorizationService {

    Authorization addFullName(Authorization fullName);
    void deleteFullName(Authorization fullName);

    Authorization addLogin(Authorization login);

    void deleteLogin(Authorization login);
}

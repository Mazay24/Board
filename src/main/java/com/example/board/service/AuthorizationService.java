package com.example.board.service;

import com.example.board.enity.Authentication;

public interface AuthorizationService {

    Authentication addFullName(Authentication fullName);
    void deleteFullName(Authentication fullName);

    Authentication addLogin(Authentication login);


    void user(Authentication login, Authentication password, Authentication fullName);

    void deleteLogin(Authentication login);
}

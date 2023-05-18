package com.example.board.service.impl;

import com.example.board.enity.Authorization;
import com.example.board.repository.AuthorizationRepository;
import com.example.board.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AuthorizationServiceImpl implements AuthorizationService {
    @Autowired
    private AuthorizationRepository authorizationRepository;

    @Override
    public Authorization addFullName(Authorization fullName) {
        Authorization saveName = authorizationRepository.saveAndFlush(fullName);
        return saveName;
    }
    @Override
    public void deleteFullName(Authorization fullName){
        authorizationRepository.delete(fullName);
    }
    @Override
    public Authorization addLogin(Authorization login){
        Authorization saveLogin = authorizationRepository.saveAndFlush(login);
        return saveLogin;
    }
    @Override
    public void deleteLogin(Authorization login){
        authorizationRepository.delete(login);
    }
}

package com.example.board.service.impl;

import com.example.board.enity.Authentication;
import com.example.board.repository.AuthorizationRepository;
import com.example.board.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AuthorizationServiceImpl implements AuthorizationService {
    @Autowired
    private AuthorizationRepository authorizationRepository;

    @Override
    public Authentication addFullName(Authentication fullName) {
        Authentication saveName = authorizationRepository.saveAndFlush(fullName);
        return saveName;
    }
    @Override
    public void deleteFullName(Authentication fullName){
        authorizationRepository.delete(fullName);
    }

    @Override
    public Authentication addLogin(Authentication login) {
        return null;
    }



    @Override
    public void user(Authentication login, Authentication password, Authentication fullName){
        Authentication saveLogin = authorizationRepository.saveAndFlush(login);
        Authentication savePassword = authorizationRepository.saveAndFlush(password);
        Authentication saveFullName = authorizationRepository.saveAndFlush(fullName);
        
    }


    @Override
    public void deleteLogin(Authentication login){
        authorizationRepository.delete(login);
    }
}

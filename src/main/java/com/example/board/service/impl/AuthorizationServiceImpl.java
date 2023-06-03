package com.example.board.service.impl;

import com.example.board.dto.AuthorizationRequest;
import com.example.board.enity.Authentication;
import com.example.board.repository.AuthorizationRepository;
import com.example.board.service.AuthorizationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



@Service
public class AuthorizationServiceImpl implements AuthorizationService {
    private final AuthorizationRepository authorizationRepository;

    public AuthorizationServiceImpl(AuthorizationRepository authorizationRepository) {
        this.authorizationRepository = authorizationRepository;
    }
    @Override
    public ResponseEntity<?> getUser(String login) {
        Authentication authentication = authorizationRepository.findByLogin(login);
        if (authentication == null) {
            return new ResponseEntity<>(new Exception("Пользователь не найден"), HttpStatus.NOT_FOUND);
        } else {
            System.out.println(authentication);
            return new ResponseEntity<>(authentication, HttpStatus.OK);
        }
    }
    @Override
    public ResponseEntity<?> createUser(AuthorizationRequest authorizationRequest) {
        Authentication authentication = authorizationRepository.findByLogin(authorizationRequest.getLogin());
        if (authentication == null){
            authorizationRepository.saveAndFlush(authorizationRequest.toDAO());
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(new Exception("Пользователь с таким Логином уже существует"), HttpStatus.CONFLICT);
        }

    }

    @Override
    public ResponseEntity<?> update(String login, AuthorizationRequest authorizationRequest) {
        Authentication authentication = authorizationRepository.findByLogin(login);
        if (authentication == null) {
            return new ResponseEntity<>(new Exception("Пользователь не найден"), HttpStatus.NOT_FOUND);
        } else {
            authorizationRepository.delete(authentication);
            authorizationRepository.saveAndFlush(authorizationRequest.toDAO());
        }
        return new ResponseEntity<>(authentication, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<?> delete(String login) {
        Authentication authentication = authorizationRepository.findByLogin(login);
        if (authentication == null) {
            return new ResponseEntity<>(new Exception("Пользователь не найден"), HttpStatus.NOT_FOUND);
        } else {
            authorizationRepository.delete(authentication);
            return new ResponseEntity<>(authentication, HttpStatus.OK);
        }
    }
}


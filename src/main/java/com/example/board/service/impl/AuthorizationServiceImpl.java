package com.example.board.service.impl;

import com.example.board.dto.AuthorizationRequest;
import com.example.board.dto.AuthorizationResponse;
import com.example.board.enity.Authentication;
import com.example.board.exception.Code;
import com.example.board.exception.CommonException;
import com.example.board.repository.AuthorizationRepository;
import com.example.board.service.AuthorizationService;
import com.example.board.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;



@Service
public class AuthorizationServiceImpl implements AuthorizationService {
    private final AuthorizationRepository authorizationRepository;
    private final ProjectService projectService;


    public AuthorizationServiceImpl(AuthorizationRepository authorizationRepository, ProjectService projectService) {
        this.authorizationRepository = authorizationRepository;
        this.projectService = projectService;
    }

    @Override
    public AuthorizationResponse getUser(String login) {
        Authentication authentication = authorizationRepository.findByLogin(login);
        if (authentication == null) {
            System.out.println("Пользователь не найден");
            throw CommonException.builder().code(Code.USER_ERROR).message("Пользователь с таким логином не найден").httpStatus(HttpStatus.BAD_REQUEST).build();
        } else {
            System.out.println(authentication);

        }
        return new AuthorizationResponse(authentication.getFullName(), authentication.getLogin());
    }

    @Override
    public AuthorizationResponse createUser(AuthorizationRequest authorizationRequest) {
        Authentication authentication = authorizationRepository.findByLogin(authorizationRequest.getLogin());
        if (authentication == null){
            authorizationRepository.saveAndFlush(authorizationRequest.toDAO());
        }
        else {
           System.out.println("Пользователь с таким логином уже существует");
           throw CommonException.builder().code(Code.USER_ERROR).message("Пользователь с таким логином уже существует").httpStatus(HttpStatus.BAD_REQUEST).build();
        }
        return new AuthorizationResponse(authorizationRequest.getFullName(),authorizationRequest.getLogin());
    }

    @Override
    public AuthorizationResponse update(String login, AuthorizationRequest authorizationRequest) {
        Authentication authentication = authorizationRepository.findByLogin(login);
        if (authentication == null) {
            System.out.println("Пользователь не найден");
            throw CommonException.builder().code(Code.USER_ERROR).message("Пользователь с таким логином не найден").httpStatus(HttpStatus.BAD_REQUEST).build();
        } else {
            authorizationRepository.delete(authentication);
            authorizationRepository.saveAndFlush(authorizationRequest.toDAO());
        }
        return new AuthorizationResponse(authorizationRequest.getFullName(),authorizationRequest.getLogin());
    }

    @Override
    public void delete(String login) {
        Authentication authentication = authorizationRepository.findByLogin(login);
        if (authentication == null) {
            System.out.println("Пользователь не найден!");
            throw CommonException.builder().code(Code.USER_ERROR).message("Пользователь с таким логином не найден").httpStatus(HttpStatus.BAD_REQUEST).build();
        } else {
            authorizationRepository.delete(authentication);
        }

    }
}


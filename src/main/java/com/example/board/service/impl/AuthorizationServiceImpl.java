package com.example.board.service.impl;

import com.example.board.AuthenticationMapper;
import com.example.board.controller.ProjectController;
import com.example.board.dto.AuthorizationRequest;
import com.example.board.dto.AuthorizationResponse;
import com.example.board.dto.ProjectRequest;
import com.example.board.enity.Authentication;
import com.example.board.exception.NotFoundException;
import com.example.board.repository.AuthorizationRepository;
import com.example.board.repository.ProjectRepository;
import com.example.board.service.AuthorizationService;
import com.example.board.service.ProjectService;
import org.springframework.stereotype.Service;



@Service
public class AuthorizationServiceImpl implements AuthorizationService {
    private final AuthorizationRepository authorizationRepository;
    private final ProjectService projectService;
    private final AuthenticationMapper mapper = AuthenticationMapper.INSTANCE;



    public AuthorizationServiceImpl(AuthorizationRepository authorizationRepository, ProjectService projectService, ProjectRepository projectRepository, ProjectController projectController) {
        this.authorizationRepository = authorizationRepository;
        this.projectService = projectService;
    }

    @Override
    public AuthorizationResponse getUser(Integer idUser){
        Authentication authentication = authorizationRepository.findByIdUser(idUser);
        if (authentication == null) {
            System.out.println("Пользователь не найден");
        } else {
            System.out.println(authentication);
            throw new NotFoundException("Такой пользователь не существует");

        }
        return mapper.fromEnity(authentication);
    }

    @Override
    public AuthorizationResponse createUser(AuthorizationRequest authorizationRequest, ProjectRequest projectRequest){
        Authentication authentication = authorizationRepository.findByIdUser(authorizationRequest.getIdUser());
        if (authentication == null){
            authorizationRepository.saveAndFlush(mapper.toDAO(authorizationRequest));
            String login = authorizationRequest.getFullName();
            projectRequest.setProjectAuthor(login);
            projectService.createProject(projectRequest);
        }
        else {
            throw new NotFoundException("Такой пользователь уже существует");
        }
        return mapper.toResponse(authorizationRequest);
    }
    @Override
    public AuthorizationResponse update(Integer idUser, AuthorizationRequest authorizationRequest){
        Authentication authentication = authorizationRepository.findByIdUser(idUser);
        if (authentication == null) {
            throw new NotFoundException("Пользователь не найден");
        } else {
            authorizationRepository.delete(authentication);
            authorizationRepository.saveAndFlush(mapper.toDAO(authorizationRequest));
        }
        return mapper.toResponse(authorizationRequest);
    }

    @Override
    public void delete(Integer idUser) {
        Authentication authentication = authorizationRepository.findByIdUser(idUser);
        if (authentication == null) {
            throw new NotFoundException("Пользователь не найден");
        } else {
            authorizationRepository.delete(authentication);
        }

    }
}

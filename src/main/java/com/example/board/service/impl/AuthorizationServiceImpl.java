package com.example.board.service.impl;

import com.example.board.Mapper.AuthenticationMapper;
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
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class AuthorizationServiceImpl implements AuthorizationService, UserDetailsService {
    private final AuthorizationRepository authorizationRepository;
    private final ProjectService projectService;
    private final AuthenticationMapper mapper = AuthenticationMapper.INSTANCE;

    public AuthorizationServiceImpl(AuthorizationRepository authorizationRepository, ProjectService projectService, ProjectRepository projectRepository, ProjectController projectController) {
        this.authorizationRepository = authorizationRepository;
        this.projectService = projectService;
    }
    @Override
    public AuthorizationResponse getUser(Long idUser){
        Authentication authentication = authorizationRepository.findByIdUser(idUser);
        if (authentication == null) {
            System.out.println("Пользователь не найден");
            throw new NotFoundException("Такой пользователь не существует");
        } else {
            System.out.println(authentication);
        }
        return mapper.fromEnity(authentication);
    }

    @Override
    public AuthorizationResponse createUser(AuthorizationRequest authorizationRequest, ProjectRequest projectRequest){
        Authentication authentication = authorizationRepository.findByLogin(authorizationRequest.getLogin());
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
    public AuthorizationResponse update(Long idUser, AuthorizationRequest authorizationRequest){
        Authentication authentication = authorizationRepository.findByIdUser(idUser);
        if (authentication == null) {
            throw new NotFoundException("Пользователь не найден");
        } else {
            authentication.setFullName(authorizationRequest.getFullName());
            authentication.setLogin(authorizationRequest.getLogin());
            authentication.setPassword(authorizationRequest.getPassword());
            authorizationRepository.save(authentication);
        }
        return mapper.fromEnity(authentication);
    }

    @Override
    public void delete(Long idUser) {
        Authentication authentication = authorizationRepository.findByIdUser(idUser);
        if (authentication == null) {
            throw new NotFoundException("Пользователь не найден");
        } else {
            authorizationRepository.delete(authentication);
        }
    }

    @Override
    public String autoreg(String login, String password) {
        boolean authentication = authorizationRepository.existsByLoginAndPassword(login, password);
        if (authentication){
            System.out.println("Пользователь найден");
        }
        else{
            throw new NotFoundException("Пользователь не найден");
        }
        return "Пользователь с логином: " + login + "\nИ паролем: " + password + " cуществует";
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Authentication authentication = authorizationRepository.findByLogin(login);
        if (authentication == null){
            throw new NotFoundException("Пользователь не найден");
        }
        return authentication;
    }
}


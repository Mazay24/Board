package com.example.board.service.impl;

import com.example.board.Mapper.AuthenticationMapper;
import com.example.board.dto.AuthorizationRequest;
import com.example.board.dto.AuthorizationResponse;
import com.example.board.enity.Authentication;
import com.example.board.exception.NotFoundException;
import com.example.board.repository.AuthorizationRepository;
import com.example.board.service.AuthorizationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
@Slf4j
public class AuthorizationServiceImpl implements AuthorizationService, UserDetailsService {
    private final AuthorizationRepository authorizationRepository;
    private final AuthenticationMapper mapper = AuthenticationMapper.INSTANCE;

    @Override
    public AuthorizationResponse getUser(Integer idUser){
        String notFound = String.format("Пользователь %d не найден.", idUser );
        Authentication authentication = authorizationRepository.findByIdUser(idUser);
        if (authentication == null) {
            log.error(notFound);
            throw new NotFoundException(notFound);
        } else {
            return mapper.Enity(authentication);
        }
    }

    @Override
    public AuthorizationResponse createUser(AuthorizationRequest authorizationRequest){
        String exists = String.format("Пользователь %d уже существует", authorizationRequest.getIdUser());
        Authentication authentication = authorizationRepository.findByLogin(authorizationRequest.getLogin());
        if (authentication == null){
            authorizationRepository.saveAndFlush(mapper.DAO(authorizationRequest));
        }
        else {
            log.info(exists);
            throw new NotFoundException(exists);
        }
        return mapper.Response(authorizationRequest);
    }
    @Override
    public AuthorizationResponse update(Integer idUser, AuthorizationRequest authorizationRequest){
        String notFound = String.format("Пользователь %d не найден.", idUser );
        Authentication authentication = authorizationRepository.findByIdUser(idUser);
        if (authentication == null) {
            log.error(notFound);
            throw new NotFoundException(notFound);
        } else {
            authentication.setFullName(authorizationRequest.getFullName());
            authentication.setLogin(authorizationRequest.getLogin());
            authentication.setPassword(authorizationRequest.getPassword());
            authorizationRepository.save(authentication);
        }
        return mapper.Enity(authentication);
    }

    @Override
    public void delete(Integer idUser) {
        String notFound = String.format("Пользователь %d не найден.", idUser );
        Authentication authentication = authorizationRepository.findByIdUser(idUser);
        if (authentication == null) {
            log.error(notFound);
            throw new NotFoundException(notFound);
        } else {
            authorizationRepository.delete(authentication);
        }
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Authentication authentication = authorizationRepository.findByLogin(login);
        if (authentication == null){
            throw new NotFoundException("notFound");
        }
        return authentication;
    }
}


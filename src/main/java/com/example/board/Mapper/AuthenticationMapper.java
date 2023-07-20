package com.example.board.Mapper;

import com.example.board.dto.AuthorizationRequest;
import com.example.board.dto.AuthorizationResponse;
import com.example.board.enity.Authentication;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthenticationMapper{
    AuthenticationMapper INSTANCE = Mappers.getMapper(AuthenticationMapper.class);
    Authentication toDAO(AuthorizationRequest authorizationRequest);
    AuthorizationResponse toResponse(AuthorizationRequest authorizationRequest);
    AuthorizationResponse fromEnity(Authentication authentication);
}

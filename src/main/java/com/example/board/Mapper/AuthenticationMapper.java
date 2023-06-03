package com.example.board.Mapper;

import com.example.board.dto.AuthorizationRequest;
import com.example.board.dto.AuthorizationResponse;
import com.example.board.enity.Authentication;
import org.mapstruct.Mapper;

@Mapper
public interface AuthenticationMapper{

    AuthorizationRequest sourceToDestination(AuthorizationResponse authorizationResponse);

    AuthorizationResponse fromResponseToRequest(AuthorizationRequest authorizationRequest);

    Authentication fromEntityToRequest(AuthorizationRequest authorizationRequest);

    Authentication fromEntityToResponse(AuthorizationResponse authorizationResponse);

    AuthorizationRequest  fromRequestToEntity(Authentication authentication);

    AuthorizationResponse fromResponseToEntity(Authentication authentication);

}

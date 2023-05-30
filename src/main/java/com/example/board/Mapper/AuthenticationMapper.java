package com.example.board.Mapper;

import com.example.board.DTO.AuthorizationRequest;
import com.example.board.DTO.AuthorizationResponse;
import com.example.board.DTO.BoardRequest;
import com.example.board.enity.Authentication;
import com.example.board.enity.Board;
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

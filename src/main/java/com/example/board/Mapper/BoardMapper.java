package com.example.board.Mapper;

import com.example.board.DTO.AuthorizationRequest;
import com.example.board.DTO.AuthorizationResponse;
import com.example.board.DTO.BoardRequest;
import com.example.board.DTO.BoardResponse;
import com.example.board.enity.Authentication;
import com.example.board.enity.Board;
import org.mapstruct.Mapper;

@Mapper
public interface BoardMapper {

    BoardRequest fromRequestToResponse(BoardResponse boardResponse);

    BoardResponse fromResponseToRequest(BoardRequest boardRequest );

    Board fromEntityToRequest(BoardRequest boardRequest );

    Board fromEntityToResponse(BoardResponse boardResponse );

    BoardRequest  fromRequestToEntity(Board board );

    BoardResponse fromResponseToEntity(Board board);
}

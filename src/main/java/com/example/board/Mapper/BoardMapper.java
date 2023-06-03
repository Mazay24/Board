package com.example.board.Mapper;

import com.example.board.dto.BoardRequest;
import com.example.board.dto.BoardResponse;
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

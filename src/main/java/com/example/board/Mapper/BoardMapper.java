package com.example.board.Mapper;

import com.example.board.dto.BoardRequest;
import com.example.board.dto.BoardResponse;
import com.example.board.enity.Board;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BoardMapper {
    BoardMapper INSTANCE = Mappers.getMapper(BoardMapper.class);
    Board toDAO(BoardRequest boardRequest);
    BoardResponse toResponse(BoardRequest boardRequest);
    BoardResponse fromEnity(Board board);
}

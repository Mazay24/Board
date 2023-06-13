package com.example.board.service;

import com.example.board.dto.AuthorizationRequest;
import com.example.board.dto.AuthorizationResponse;
import com.example.board.dto.BoardRequest;
import com.example.board.dto.BoardResponse;

public interface BoardService {
    BoardResponse getProjectInfo(String name);
    BoardResponse createProjectInfo(BoardRequest boardRequest);
    BoardResponse update(String name, BoardRequest boardRequest);
    public void delete(String name);
}

package com.example.board.service;

import com.example.board.dto.BoardRequest;
import com.example.board.dto.BoardResponse;

public interface BoardService {
    BoardResponse getProjectInfo(Integer idProject);
    BoardResponse createProjectInfo(BoardRequest boardRequest);
    BoardResponse update(Integer idProject, BoardRequest boardRequest);
    void delete(Integer idProject);
}

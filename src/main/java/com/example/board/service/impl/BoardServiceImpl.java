package com.example.board.service.impl;

import com.example.board.dto.AuthorizationResponse;
import com.example.board.dto.BoardRequest;
import com.example.board.dto.BoardResponse;
import com.example.board.enity.Authentication;
import com.example.board.enity.Board;
import com.example.board.exception.Code;
import com.example.board.exception.CommonException;
import com.example.board.repository.BoardRepository;
import com.example.board.service.BoardService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;

    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;

    }

    @Override
    public BoardResponse getProjectInfo(String name) {
        Board board = boardRepository.findByNameProject(name);
        if (board == null){
            System.out.println("Проект не найден");
            throw CommonException.builder().code(Code.PROJECT_ERROR).message("Проект с таким названием не найден").httpStatus(HttpStatus.BAD_REQUEST).build();
        }
        else {
            System.out.println(board);
        }
        return new BoardResponse(board.getNameProject(), board.getAllTasks(), board.getDebt());
    }

    @Override
    public BoardResponse createProjectInfo(BoardRequest boardRequest) {
        Board board = boardRepository.findByNameProject(boardRequest.getNameProject());
        if (board == null){
            boardRepository.saveAndFlush(boardRequest.toDAO());
        }
        else {
            throw CommonException.builder().code(Code.PROJECT_ERROR).message("Проект с таким названием уже существует").httpStatus(HttpStatus.BAD_REQUEST).build();
        }

        return new BoardResponse(boardRequest.getNameProject(), boardRequest.getAllTasks(), boardRequest.getDebt());
    }

    @Override
    public BoardResponse update(String name, BoardRequest boardRequest) {
        Board board = boardRepository.findByNameProject(name);
        if (board == null) {
            System.out.println("Пользователь не найден");
            throw CommonException.builder().code(Code.PROJECT_ERROR).message("Проект с таким названием уже существует").httpStatus(HttpStatus.BAD_REQUEST).build();
        } else {
            boardRepository.delete(board);
            boardRepository.saveAndFlush(boardRequest.toDAO());
        }
        return new BoardResponse(boardRequest.getNameProject(), boardRequest.getAllTasks(), boardRequest.getDebt());
    }

    @Override
    public void delete(String name) {
       Board board = boardRepository.findByNameProject(name);
        if (board == null) {
            System.out.println("Пользователь не найден!");
            throw CommonException.builder().code(Code.PROJECT_ERROR).message("Проект с таким названием не найден").httpStatus(HttpStatus.BAD_REQUEST).build();
        } else {
            boardRepository.delete(board);
        }

    }
}

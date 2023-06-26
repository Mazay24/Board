package com.example.board.service.impl;

import com.example.board.BoardMapper;
import com.example.board.dto.BoardRequest;
import com.example.board.dto.BoardResponse;
import com.example.board.enity.Board;
import com.example.board.exception.NotFoundException;
import com.example.board.repository.BoardRepository;
import com.example.board.service.BoardService;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;
    private final BoardMapper mapper = BoardMapper.INSTANCE;

    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;

    }

    @Override
    public BoardResponse getProjectInfo(Integer idProject) {
        Board board = boardRepository.findByIdProject(idProject);
        if (board == null){
            throw new NotFoundException("Проект не найден");
        }
        else {
            System.out.println(board);
        }
        return mapper.fromEnity(board);
    }

    @Override
    public BoardResponse createProjectInfo(BoardRequest boardRequest){
        Board board = boardRepository.findByIdProject(boardRequest.getIdProject());
        if (board == null){
            boardRepository.saveAndFlush(mapper.toDAO(boardRequest));
        }
        else {
            throw new NotFoundException("Такой пользователь уже существует");
        }
        return mapper.toResponse(boardRequest);
    }

    @Override
    public BoardResponse update(Integer idProject, BoardRequest boardRequest) {
        Board board = boardRepository.findByIdProject(idProject);
        if (board == null) {
            throw new NotFoundException("Проект не найден");
        } else {
            int allTask = board.getAllTasks() + 1;
            int debt = board.getDebt();
            boardRepository.delete(board);
            boardRequest.setAllInfo(idProject, allTask,debt);
            boardRepository.saveAndFlush(mapper.toDAO(boardRequest));
        }
        return mapper.toResponse(boardRequest);
    }

    @Override
    public void delete(Integer idProject) {
       Board board = boardRepository.findByIdProject(idProject);
        if (board == null) {
            throw new NotFoundException("Проект не найден");
        } else {
            boardRepository.delete(board);
        }
    }


}

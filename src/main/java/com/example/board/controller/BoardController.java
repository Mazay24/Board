package com.example.board.controller;

import com.example.board.dto.BoardRequest;
import com.example.board.dto.BoardResponse;
import com.example.board.service.BoardService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @Operation(summary = "Просмотр задач")
    @GetMapping("/{idProject}/info-board")
    ResponseEntity<BoardResponse> getTask(@PathVariable("idProject") Integer idProject) {
        return ResponseEntity.ok(boardService.getProjectInfo(idProject));
    }
    @Operation(summary = "Создание задач")
    @PostMapping("/task")
    ResponseEntity<BoardResponse> postIdtask(@Validated @RequestBody BoardRequest boardRequest) {
        return ResponseEntity.ok(boardService.createProjectInfo(boardRequest));
    }
    @Operation(summary = "Обнавление задач")
    @PutMapping("/{idProject}/board")
    ResponseEntity<BoardResponse> update(@PathVariable("idProject") Integer idProject, @Validated @RequestBody BoardRequest boardRequest){
        return ResponseEntity.ok(boardService.update(idProject, boardRequest));
    }
    @Operation(summary = "Удаление задач")
    @DeleteMapping("/{idProject}/task")
    ResponseEntity<?> deleteTask(@PathVariable("idProject") Integer idProject){
        boardService.delete(idProject);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}

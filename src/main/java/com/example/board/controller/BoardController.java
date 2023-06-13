package com.example.board.controller;

import com.example.board.dto.AuthorizationRequest;
import com.example.board.dto.BoardRequest;
import com.example.board.service.BoardService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @Operation(summary = "Просмотр задач")
    @GetMapping("/{name}/info-board")
    ResponseEntity<?> getTask(@PathVariable("name") String name) {
        return new ResponseEntity<>(boardService.getProjectInfo(name), HttpStatus.OK);
    }
    @Operation(summary = "Создание задач")
    @PostMapping("/task")
    ResponseEntity<?> postIdtask(@Validated @RequestBody BoardRequest boardRequest) {
        return new ResponseEntity<>(boardService.createProjectInfo(boardRequest), HttpStatus.CREATED);
    }
    @Operation(summary = "Обнавление задач")
    @PutMapping("/{name}/board")
    ResponseEntity<?> update(@PathVariable("name") String name, @Validated @RequestBody BoardRequest boardRequest){
        return new ResponseEntity<>(boardService.update(name, boardRequest), HttpStatus.OK);
    }
    @Operation(summary = "Удаление задач")
    @DeleteMapping("/{name}/task")
    ResponseEntity<?> deleteTask(@PathVariable("name") String name){
        boardService.delete(name);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

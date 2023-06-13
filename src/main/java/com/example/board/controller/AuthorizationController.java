package com.example.board.controller;

import com.example.board.dto.AuthorizationRequest;
import com.example.board.service.AuthorizationService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Controller
@RestController
@RequestMapping("/authorization")
public class AuthorizationController {
    private final AuthorizationService authorizationService;

    public AuthorizationController(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    @Operation(summary = "Получение пользователя")
    @GetMapping("/{id}/info-users")
    ResponseEntity<?> users(@PathVariable("id") String login){
                return new ResponseEntity<>(authorizationService.getUser(login), HttpStatus.OK);
    }
    @Operation(summary = "Создание пользователя")
    @PostMapping("/info-users")
    ResponseEntity<?> createUser(@Validated @RequestBody AuthorizationRequest authorizationRequest) {
        return new ResponseEntity<>(authorizationService.createUser(authorizationRequest), HttpStatus.CREATED);
    }
    @PutMapping("/{id}/user")
    ResponseEntity<?> update(@PathVariable("id") String login, @Validated @RequestBody AuthorizationRequest authorizationRequest){
        return new ResponseEntity<>(authorizationService.update(login, authorizationRequest), HttpStatus.OK);
    }

    @DeleteMapping("/{id}/info-users")
    ResponseEntity<?> deleteUser(@PathVariable("id") String login){
        authorizationService.delete(login);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}

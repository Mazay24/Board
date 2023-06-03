package com.example.board.controller;

import com.example.board.DTO.AuthorizationRequest;
import com.example.board.service.AuthorizationService;
import io.swagger.v3.oas.annotations.Operation;
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
        return authorizationService.getUser(login);
    }
    @Operation(summary = "Создание пользователя")
    @PostMapping("/{id}/info-users")
    ResponseEntity<?> createUser(@Validated @RequestBody AuthorizationRequest authorizationRequest) {
        return authorizationService.createUser(authorizationRequest);
    }
    @PutMapping("/{id}/user")
    ResponseEntity<?> update(@PathVariable("id") String login, @Validated @RequestBody AuthorizationRequest authorizationRequest){

        return authorizationService.update(login, authorizationRequest);
    }

    @DeleteMapping("/{id}/info-users")
    ResponseEntity<?> deleteUser(@PathVariable("id") String login){
        return authorizationService.delete(login);
    }



}

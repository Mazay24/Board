package com.example.board.controller;

import com.example.board.dto.AuthorizationRequest;
import com.example.board.dto.AuthorizationResponse;
import com.example.board.service.AuthorizationService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping("/authorization")
@RequiredArgsConstructor
public class AuthorizationController {
    private final AuthorizationService authorizationService;

    @Operation(summary = "Получение пользователя")
    @GetMapping("/info-users/{id}")
    ResponseEntity<AuthorizationResponse> users(@PathVariable("id") Integer idUser){
            return ResponseEntity.ok(authorizationService.getUser(idUser));
    }
    @Operation(summary = "Создание пользователя")
    @PostMapping("/info-users")
    ResponseEntity<AuthorizationResponse> createUser(@Validated @RequestBody AuthorizationRequest authorizationRequest) {
            return ResponseEntity.ok(authorizationService.createUser(authorizationRequest));
    }
    @PutMapping("/user/{id}")
    ResponseEntity<AuthorizationResponse> update(@PathVariable("id") Integer idUser, @Validated @RequestBody AuthorizationRequest authorizationRequest) {
            return ResponseEntity.ok(authorizationService.update(idUser, authorizationRequest));
    }
    @DeleteMapping("/info-users/{id}")
    ResponseEntity<?> deleteUser(@PathVariable("id") Integer idUser){
            authorizationService.delete(idUser);
            return ResponseEntity.ok(HttpStatus.OK);
    }
}

package com.example.board.controller;

import com.example.board.DTO.AuthorizationRequest;
import com.example.board.DTO.AuthorizationResponse;
import com.example.board.exception.Code;
import com.example.board.exception.CommonException;
import io.swagger.v3.oas.annotations.Operation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RestController
@RequestMapping("/authorization")
public class AuthorizationController {
    @Operation(summary = "Получение пользователя")
    @GetMapping("/info-users")
    ResponseEntity<?> users(@RequestHeader(value = "fullName")String fullName, @RequestHeader(value = "login")String login){
        return null;
    }

    @Operation(summary = "Создание пользователя")
    @PostMapping("/info-users")
    ResponseEntity<?> createUser(@Validated @RequestBody AuthorizationRequest authorizationRequest) {
        return null;
    }

    @DeleteMapping("/info-users")
    ResponseEntity<?> deleteUser(){
        return null;
    }



}

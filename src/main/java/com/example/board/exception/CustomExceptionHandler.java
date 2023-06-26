package com.example.board.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class CustomExceptionHandler extends Throwable {
    @org.springframework.web.bind.annotation.ExceptionHandler
    public ResponseEntity handle(NotFoundException exception) {
        log.error(exception.getMessage(), exception);
        return new ResponseEntity(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler
    public ResponseEntity handle(InternalException internalException){
        log.error(internalException.getMessage(), internalException);
        return new ResponseEntity(internalException.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler
    public ResponseEntity handle(BadRequestException badRequestException){
        log.error(badRequestException.getMessage(), badRequestException);
        return new ResponseEntity(badRequestException.getMessage(),HttpStatus.BAD_REQUEST);
    }
}

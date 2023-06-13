package com.example.board.exception;

import com.example.board.error.Error;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@Slf4j
@ControllerAdvice
@Builder
public class ErrorHandler {
@ExceptionHandler(CommonException.class)
    public ResponseEntity<ErrorResponse> handleCommonException(CommonException e){
        log.error("common error: {}", e.toString());
        return new ResponseEntity<>(ErrorResponse.builder().error(Error.builder().code(e.getCode()).message(e.getMessage()).build()).build(), e.getHttpStatus());
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<com.example.board.exception.ErrorResponse> errorHandlerResponseEntity (Exception e) {
        e.printStackTrace();
        log.error("internal server error: {}", e.toString());

        return new ResponseEntity<>(com.example.board.exception.ErrorResponse.builder().error(Error.builder().code(Code.Test).message("Внутреняя ошибка сервиса").build()).build(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

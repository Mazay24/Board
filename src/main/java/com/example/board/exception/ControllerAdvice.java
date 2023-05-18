package com.example.board.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {
    Logger log = LogManager.getLogger(ControllerAdvice.class);

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<Response> handleException(BusinessException e) {
        Response response = new Response(e.getMessage());
        log.error("common error: {}" , e.toString());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @Bean
    public CommonsRequestLoggingFilter requestLoggingFilter() {
        CommonsRequestLoggingFilter loggingFilter = new CommonsRequestLoggingFilter();
        loggingFilter.setIncludeClientInfo(true);
        loggingFilter.setIncludeQueryString(true);
        loggingFilter.setIncludePayload(true);
        loggingFilter.setMaxPayloadLength(64000);
        return loggingFilter;
    }
}

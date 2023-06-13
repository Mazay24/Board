package com.example.board.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
@org.springframework.web.bind.annotation.ControllerAdvice
public class Log {
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

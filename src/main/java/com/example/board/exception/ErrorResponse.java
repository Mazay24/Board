package com.example.board.exception;

import lombok.Builder;
import lombok.Data;
import org.apache.catalina.connector.Response;

@Data
@Builder
public class ErrorResponse extends Response {

    private Error error;
}

package com.example.board.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String error) {
        super(error);
    }
}

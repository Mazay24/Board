package com.example.board.error;

import com.example.board.enums.Code;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Error extends java.lang.Error {

    private Code code;
    private String message;

}

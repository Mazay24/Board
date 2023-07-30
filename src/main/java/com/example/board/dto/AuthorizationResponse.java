package com.example.board.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NonNull;

@Data
@Getter
@Setter
@AllArgsConstructor
public class AuthorizationResponse {
    @NonNull
    private Long idUser;
    @Schema(description = "Имя Фамилия, пользователя")
    private String fullName;
    @Schema(description = "Логин")
    @NonNull
    private String login;
    @Schema(description = "Пароль")
    @NonNull
    private String password;
}

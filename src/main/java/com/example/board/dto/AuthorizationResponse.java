package com.example.board.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Data

@Getter
@Setter
@AllArgsConstructor
public class AuthorizationResponse {
    @NonNull
    private Integer idUser;
    @Schema(description = "Имя Фамилия, пользователя")
    private String fullName;
    @Schema(description = "Логин")
    @NonNull
    private String login;
    @Schema(description = "Пароль")
    @NonNull
    private String password;
}

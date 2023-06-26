package com.example.board.dto;


import com.example.board.enity.Authentication;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
@Data
@Setter
@Getter
@Schema(description = "Authorization DTO")
public class AuthorizationRequest {
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

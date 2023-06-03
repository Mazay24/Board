package com.example.board.DTO;


import com.example.board.enity.Authentication;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Setter
@Getter
@Schema(description = "Authorization DTO")
public class AuthorizationRequest {
    @Schema(description = "Имя Фамилия, пользователя")
    @NonNull
    private String fullName;
    @Schema(description = "Логин")
    @NonNull
    @Getter
    @Setter
    private String login;
    @Schema(description = "Пароль")
    @NonNull
    @Size(min = 6, message = "{validation.name.size.too_short}")
    private String password;

    public Authentication toDAO(){
        return new Authentication(fullName, login, password);
    }

}

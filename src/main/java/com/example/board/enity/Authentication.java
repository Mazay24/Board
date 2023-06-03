package com.example.board.enity;

import com.example.board.DTO.AuthorizationRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Authentication")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Authentication {
    @Id
    @Column(name = "Full_name", nullable = false, length = 70)
    private String fullName;
    @Column(name = "Login", nullable = false, length = 50)
    private String login;
    @Column(name = "Password", nullable = false, length = 25)
    private String password;

    public void setAll(AuthorizationRequest authorizationRequest) {
        this.login = authorizationRequest.getLogin();
        this.fullName = authorizationRequest.getFullName();
        this.password = authorizationRequest.getPassword();
    }
}



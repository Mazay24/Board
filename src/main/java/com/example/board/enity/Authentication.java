package com.example.board.enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
}
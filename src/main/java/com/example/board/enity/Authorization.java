package com.example.board.enity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Authorization")
public class Authorization {
    @Id
    @Column(name = "FI", nullable = false, length = 70)
    private String fullName;
    @Column(name = "Login", nullable = false, length = 50)
    private String login;
    @Column(name = "Password", nullable = false, length = 25)
    private String password;

    public Authorization() {
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}

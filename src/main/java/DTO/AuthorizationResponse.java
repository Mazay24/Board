package DTO;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AuthorizationResponse {

    private String fullName;
    private String login;
    private String password;

    public void setFi(String fi) {
        this.fullName = fullName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFi() {
        return fullName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
    @PostMapping("/authorization")
    public ResponseEntity<AuthorizationResponse> createProduct(
            @RequestBody AuthorizationRequest request) {
        return null;
    }

}

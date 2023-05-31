package DTO;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AuthorizationResponse {

    private static String fi;
    private static String login;
    private static String password;

    public void setFi(String fi) {
        this.fi = fi;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFi() {
        return fi;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
    @PostMapping("/Authorization")
    public ResponseEntity<AuthorizationResponse> createProduct(
            @RequestBody AuthorizationRequest request) {
        return null;
    }

}

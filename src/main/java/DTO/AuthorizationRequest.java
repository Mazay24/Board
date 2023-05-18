package DTO;


public class AuthorizationRequest {

    private String fullName;
    private String login;
    private String password;

    public void setFullName(String fi) {
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

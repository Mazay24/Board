package DTO;


public class AuthorizationRequest {

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


}

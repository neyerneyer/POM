package co.com.orange.utils.models;

public class UserLogin {
    private final String userName;
    private final String password;

    public UserLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
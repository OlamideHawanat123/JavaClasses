package LambdasAndStreams.UserTask;

public class User {
    private String username;
    private String password;
    private boolean isValid;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }

    public String toString(){
        return username + " " + password + " " + isValid;
    }
}

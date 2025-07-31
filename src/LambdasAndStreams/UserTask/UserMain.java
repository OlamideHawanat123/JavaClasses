package LambdasAndStreams.UserTask;

public class UserMain {
    public static void main(String[] args) {
        User user = new User("semicolon", "semicolon");
        UserDetailsService userDetailsService = (String username, String password)->{
            if(username.equals(password)){
                user.setValid(true);
                return user;
            }

            return null;
        };

        System.out.println(userDetailsService.userDetails("semicolon", "semicolon"));
    }

}

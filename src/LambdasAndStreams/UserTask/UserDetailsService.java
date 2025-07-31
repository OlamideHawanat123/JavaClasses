package LambdasAndStreams.UserTask;

@FunctionalInterface
public interface UserDetailsService {
    User userDetails(String username, String password);

}

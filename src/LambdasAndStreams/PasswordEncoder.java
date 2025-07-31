package LambdasAndStreams;

@FunctionalInterface
public interface PasswordEncoder {
    boolean reversePassword(String password, String reversed);



}

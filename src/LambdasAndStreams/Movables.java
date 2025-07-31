package LambdasAndStreams;

@FunctionalInterface
public interface Movables {
    void move(int distance);

    static void reverse(int distance){
        System.out.println(distance);
    }

    default void move(double distance){
        System.out.println(distance);
    }

}

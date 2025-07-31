package LambdasAndStreams.Consumers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerImplementation {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (Integer x)->{
            System.out.println(x);

        };
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.forEach(consumer);

    }
}

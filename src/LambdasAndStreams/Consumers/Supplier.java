package LambdasAndStreams.Consumers;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.stream.Stream;

public class Supplier {
    public static void main(String[] args) {

        java.util.function.Supplier<Integer> supplier = () -> new Random().nextInt(10);
        Integer number = supplier.get();
        System.out.println(number);

        Stream.generate(supplier)
                .limit(5)
                .forEach(System.out::println);

    }
}

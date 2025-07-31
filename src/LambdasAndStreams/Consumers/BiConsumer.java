package LambdasAndStreams.Consumers;

import java.util.HashMap;
import java.util.Map;

public class BiConsumer {
    public static void main(String[] args) {
        java.util.function.BiConsumer<Integer, Integer> biConsumer =(Integer a, Integer b )-> System.out.println(a * b);
        biConsumer.accept(5, 4);

        Map<Integer,Integer> map = new HashMap<>();
        map.put(5,4);
        map.put(3,4);
        map.put(4,6);

        map.forEach(biConsumer);
    }
}

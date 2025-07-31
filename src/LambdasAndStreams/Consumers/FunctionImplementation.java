package LambdasAndStreams.Consumers;

import java.util.function.Function;

import static java.awt.SystemColor.text;

public class FunctionImplementation {
    public static void main(String[] args) {
        Function<Integer, Integer> function = (x)-> x + x;
        Integer number = function.apply(5);
        System.out.println(number);

        Function<String, Boolean> booleanFunction = (String text) -> text.matches("[0-9]+");
        boolean res = booleanFunction.apply("911");
        System.out.println(res);
    }
}

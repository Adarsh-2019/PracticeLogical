package org.logical.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterFromString {
    public static void main(String[] args) {
        String inputString = "Java is widely use language";
        Map<Character, Long> collect = inputString.chars()
                .mapToObj(c -> (char) c).collect(Collectors
                        .groupingBy(Function.identity(),
                                Collectors.counting()));
        System.out.println(collect);
    }
}

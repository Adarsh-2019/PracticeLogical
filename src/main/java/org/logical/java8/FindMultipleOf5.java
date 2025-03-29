package org.logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMultipleOf5 {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> collect = listOfIntegers.stream().filter(n -> n % 5 == 0).sorted().collect(Collectors.toList());//.forEach(System.out::println);
        System.out.println(collect);
    }
}

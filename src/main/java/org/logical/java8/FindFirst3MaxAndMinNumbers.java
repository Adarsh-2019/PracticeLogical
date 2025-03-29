package org.logical.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindFirst3MaxAndMinNumbers {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        System.out.println("First Three Min !");
        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
        System.out.println("===========================");

        System.out.println("First Three Max");
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}

package org.logical.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer integer = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(integer);
    }
}

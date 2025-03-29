package org.logical.april;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateOddAndEvenNumber {
    //Given a list of integers, separate odd and even numbers
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 45, 66, 78, 33, 12, 11, 45, 79, 50);
        separetOddAndEven(list);
    }

    public static void separetOddAndEven(List<Integer> list) {
        Map<String, List<Integer>> result = list.stream().collect(Collectors.groupingBy(num -> (num % 2 == 0) ? "Even" : "Odd"));
        System.out.println(result.get("Even"));
        System.out.println(result.get("Odd"));
    }
}

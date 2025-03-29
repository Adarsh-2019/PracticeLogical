package org.logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SeparateOddAndEvenNumbers {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> oddEvenNumberMap = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Set<Map.Entry<Boolean, List<Integer>>> entries = oddEvenNumberMap.entrySet();
        for (Map.Entry<Boolean, List<Integer>> entry : entries) {
            if (entry.getKey()) {
                System.out.println("Even Numbers are :");
            } else {
                System.out.println("Odd Numbers are :");
            }
            System.out.println("---------------------------------");
            List<Integer> value = entry.getValue();
            for (Integer val : value) {
                System.out.println(val);
            }
        }
    }

    /*public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        List<Integer> collect = listOfIntegers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }*/
}
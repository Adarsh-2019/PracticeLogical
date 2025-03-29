package org.logical.logicals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5);
        removeDuplicate(list);
    }

    private static void removeDuplicate(List<Integer> inputArray) {
        List<Integer> collect = inputArray.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}

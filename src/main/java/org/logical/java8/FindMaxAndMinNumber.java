package org.logical.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMinNumber {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        Integer min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Max :"+max +","+ "Min :"+min);
    }
}

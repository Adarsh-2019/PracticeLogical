package org.logical.logicals;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class FindSumOfNaturalNumber {
    public static void main(String[] args) {
        OptionalDouble average = IntStream.range(1, 11).average();
        System.out.println(average);
    }
}

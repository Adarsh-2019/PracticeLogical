package org.logical.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoUnsortedArrayWithoutDuplicate {
    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 5, 1};

        int[] b = new int[] {8, 1, 9, 5};

        int[] numbers = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();
        System.out.println(Arrays.toString(numbers));
    }
}

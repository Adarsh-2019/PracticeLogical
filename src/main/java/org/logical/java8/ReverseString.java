package org.logical.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        String collect = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word)).collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}

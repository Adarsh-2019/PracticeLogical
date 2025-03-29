package org.logical.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        Set<String> uniqueElements = new HashSet<>();
        Set<String> collect = Arrays.stream(inputString.split("")).filter(ch -> !uniqueElements.add(ch)).collect(Collectors.toSet());
        System.out.println(collect);
    }
}

package org.logical.april;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateInteger {
    //How do you remove duplicate elements from a list using Java 8 streams?
    public static void main(String[] args) {
        List<String> list =	Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        //list.stream().distinct().forEach(System.out::println);
        List<String> list1 = list.stream().collect(Collectors.toCollection(LinkedHashSet::new)).stream().collect(Collectors.toList());
        list1.stream().forEach(System.out::println);

        //
    }
}

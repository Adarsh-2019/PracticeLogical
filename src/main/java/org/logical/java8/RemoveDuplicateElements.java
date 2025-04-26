package org.logical.java8;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> collect = listOfStrings.stream().distinct().collect(Collectors.toList());
        //System.out.println(collect);
        //find duplicate words
        Set set=new HashSet();
        List<String> duplicatesWords = listOfStrings.stream().filter(word -> !set.add(word)).collect(Collectors.toList());
        System.out.println(duplicatesWords);
    }
}

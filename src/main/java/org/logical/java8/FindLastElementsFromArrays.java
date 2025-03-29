package org.logical.java8;

import java.util.Arrays;
import java.util.List;

public class FindLastElementsFromArrays {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        String str = listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get();
        System.out.println(str);
    }
}

package org.logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElements {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        Map<String, Long> mapCounting = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<String, Long> entry = mapCounting.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(mapCounting);
        System.out.println("===============================");
        System.out.println(entry.getKey());
    }
}

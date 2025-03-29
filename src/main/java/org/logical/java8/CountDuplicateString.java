package org.logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateString {
    public static void main(String[] args) {
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> collect = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));//{Pen=2, Stapler=1, Pencil=2, Note Book=2, Eraser=1}
        //Map<Character, Long> collect = stationeryList.toString().chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}

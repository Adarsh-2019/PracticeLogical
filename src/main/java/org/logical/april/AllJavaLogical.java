package org.logical.april;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AllJavaLogical {
    public static void main(String[] args) {

        //How do you find frequency of each character in a string using Java 8 streams?
        String str="frequency of each character";
        /*str.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()+"-"+entry.getValue())
                .forEach(System.out::println);*/

        //How do you find frequency of each element in an array or a list?
        List<String> list =	Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        String[] arrays = {"Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil"};

        list.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>0)
                .map(entry->entry.getKey()+"-"+entry.getValue()).forEach(System.out::println);
    }
}

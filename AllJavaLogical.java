package org.logical.april;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AllJavaLogical {
    public static void main(String[] args) {

        //How do you find frequency of each character in a string using Java 8 streams?
        String str = "frequency of each character";
        /*str.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()+"-"+entry.getValue())
                .forEach(System.out::println);*/

        //How do you find frequency of each element in an array or a list?
        List<String> list = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        String[] arrays = {"Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil"};

        /*list.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>0)
                .map(entry->entry.getKey()+"-"+entry.getValue()).forEach(System.out::println);*/
       /* Arrays.stream(arrays).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>0).map(entry->entry.getKey()+"-"+entry.getValue())
                .forEach(System.out::println);*/

        //How do you sort the given list of decimals in reverse order?
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        //decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //reverse order
        //decimalList.stream().sorted().forEach(System.out::println);


        //Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        /*List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String collect = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.printf(collect);*/

        /*//From the given list of integers, print the numbers which are multiples of 5?
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers.stream().filter(num->num%5==0).forEach(System.out::println);*/

        //Given a list of integers, find maximum and minimum of those numbers?
        List<Integer> listOfInteger = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        /*Integer max = listOfInteger.stream().max(Comparator.naturalOrder()).get();
        Integer min = listOfInteger.stream().min(Comparator.naturalOrder()).get();
        System.out.println("max- "+max);
        System.out.printf("min- "+min);*/

        /*IntSummaryStatistics states = listOfInteger.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Max -"+states.getMax());
        System.out.println("Min -"+states.getMin());*/

        //How do you merge two unsorted arrays into single sorted array using Java 8 streams?

       /* int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5};*/
        //IntStream.concat(Arrays.stream(a).sorted(),Arrays.stream(b).sorted()).forEach(System.out::println);
        /*int[] toArray = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .sorted()
                .toArray();
        System.out.println( Arrays.toString(toArray));*/

        //10) How do you merge two unsorted arrays into single sorted array without duplicates?
        /*int[] a = new int[] {4, 2, 5, 1};

        int[] b = new int[] {8, 1, 9, 5};
        int[] toArray=IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .sorted().distinct()
                .toArray();
        System.out.println(Arrays.toString(toArray));*/

        //11) How do you get three maximum numbers and three minimum numbers from the given list of integers?
        /*List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> min3 = listOfIntegers.stream().sorted(Comparator.naturalOrder()).limit(3).collect(Collectors.toList());
        List<Integer> max3 = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(min3);
        System.out.println(max3);*/

        //12Java 8 program to check if two strings are anagrams or not?

        /*String s1 = "RaceCar";
        String s2 = "CarRace";
        String sortedStr1 = s1.chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        String sortedStr2 = s2.chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        if (sortedStr1.equals(sortedStr2)) {
            System.out.println("anagram");
        }else {
            System.out.println("not anagram");
        }*/

        //13) Find sum of all digits of a number in Java 8?
        int i = 15623;
        int sum = String.valueOf(i).chars().map(Character::getNumericValue).sum();
    }
}

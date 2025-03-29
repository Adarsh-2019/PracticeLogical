package org.logical.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckAnagram {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";

         String collect1 = Stream.of(s1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
         String collect2 = Stream.of(s2.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());

         if (collect1.equals(collect2)){
             System.out.println("This is anagram");
         }else {
             System.out.println("This is not a anagram");
         }
    }
}

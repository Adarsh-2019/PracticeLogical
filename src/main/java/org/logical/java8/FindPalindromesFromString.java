package org.logical.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindPalindromesFromString {
    public static void main(String[] args) {
        String input = "madam racecar apple level kayak banana";
        //findPalindromes(input);
        List<String> palindromes = Arrays.stream(input.split(" ")).filter(word -> word.equalsIgnoreCase(new StringBuffer(word).reverse().toString())).collect(Collectors.toList());
        System.out.println(palindromes);
    }

    private static void findPalindromes (String input) {
        List<String> stringList = Arrays.stream(input.split(" ")).filter(word -> isPalindrom(word)).collect(Collectors.toList());
        System.out.println(stringList);
    }

    private static boolean isPalindrom(String word) {
        return word.equalsIgnoreCase(new StringBuffer(word).reverse().toString());
    }
}

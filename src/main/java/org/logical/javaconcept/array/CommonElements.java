package org.logical.javaconcept.array;

import java.util.HashSet;

//6) Write a Java program to find the intersection of two arrays?
public class CommonElements {
    public static void main(String[] args) {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

        /*HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    set.add(s1[i]);
                }
            }
        }
        System.out.println("Common Elements are ");
        System.out.println(set);*/

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> commonElements = new HashSet<>();

        // Add elements of s1 to set1
        for (String value : s1) {
            set1.add(value);
        }
        for (String value : s2) {
            if (set1.contains(value)) {
                commonElements.add(value);
            }
        }
        System.out.println("Common Elements are ");
        System.out.println(commonElements);
    }
}

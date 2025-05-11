package org.logical.javaconcept.array;

import java.util.HashSet;
import java.util.Set;

//13) Write a Java program to remove duplicate elements from an array?
public class RemoveDuplicatesJavaExample {
    public static void main(String[] args) {
        Set<Integer> duplicates = removeDuplicates(new int[]{7, 3, 21, 7, 34, 18, 3, 21});
        System.out.println(duplicates);
    }

    private static Set<Integer> removeDuplicates(int[] arrays) {
        //duplicate elements
        /*Set<Integer> set = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for (int number : arrays) {
            if (!set.add(number)) {
                duplicate.add(number);
            }
        }
        return duplicate;*/

        //remove duplicate elements
        Set<Integer> set=new HashSet<>();
        for (int number:arrays){
            set.add(number);
        }
        return set;
    }
}

package org.logical.javaconcept.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//11) Write a Java program to count occurrences of each element in an array?
public class ArrayElementCountExample {
    public static void main(String[] args) {
        arrayElementCount(new int[]{891, 187, 891, 187, 891, 476, 555, 741});
    }

    private static void arrayElementCount(int[] inputNumber) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer number : inputNumber) {
            if (!map.containsKey(number)) {
                map.put(number, 1);
            } else {
                map.put(number, map.get(number) + 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 0) {
                System.out.println(entry);
            }
        }
    }
}

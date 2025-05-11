package org.logical.javaconcept.array;


//8) Write a Java program to find all the leaders in an integer array?
public class FindTheLeaders {
    public static void main(String[] args) {
        findTheLeaders(new int[]{32, 9, 7, 14, 8, 6, 3});
    }

    private static void findTheLeaders(int[] ints) {
        int maxElement = ints[ints.length - 1];
        System.out.println(ints[ints.length-1]);
        for (int i = ints.length - 2; i >= 0; i--) {
            if (ints[i] > maxElement) {
                System.out.println(ints[i]);
                maxElement = ints[i];
            }
        }
    }
}

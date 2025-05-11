package org.logical.javaconcept.array;

import java.util.Arrays;

//4) Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?
public class PairsOfElementsInArray {
    public static void main(String[] args) {
        int inputArray[] = {4, 6, 5, -10, 8, 5, 20};
        int pairSum = 10;
        System.out.println("Pair of sum ");
        findPair(inputArray, pairSum);
    }

    private static void findPair(int[] inputArray, int pairSum) {
        int start = 0;
        int end = inputArray.length - 1;
        Arrays.sort(inputArray);
        while (start < end) {
            if (inputArray[start]+inputArray[end]==pairSum){
                System.out.println("("+inputArray[start]+","+inputArray[end]+")");
                start++;
                end--;
            } else if (inputArray[start]+inputArray[end]>pairSum) {
                end--;
            } else if (inputArray[start]+inputArray[end]<pairSum) {
                start++;
            }
        }
    }
}

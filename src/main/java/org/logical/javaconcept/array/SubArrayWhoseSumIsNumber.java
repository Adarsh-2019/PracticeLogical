package org.logical.javaconcept.array;

import java.util.Arrays;

//5) Write a Java program to find continuous sub array whose sum is equal to a given number?
public class SubArrayWhoseSumIsNumber {
    public static void main(String[] args) {
        int[] inputArray = {42, 15, 12, 8, 6, 32};
        int number = 26;
        findSubArrayWhoseSum(inputArray, number);
    }

    private static void findSubArrayWhoseSum(int[] inputArray, int number) {
        int sum = inputArray[0];
        int start = 0;

        for (int i = 1; i < inputArray.length; i++) {
            sum += inputArray[i];

            while (sum > number && start <= i - 1) {
                sum = sum - inputArray[start];
                start++;
            }
            if (sum == number) {
                System.out.println("Continuous sub array of " + Arrays.toString(inputArray) + " whose sum is " + number + " is ");
                for (int j = start; j <= i; j++) {
                    System.out.print(inputArray[j] + " ");
                }
                System.out.println();
            }
        }
    }
}

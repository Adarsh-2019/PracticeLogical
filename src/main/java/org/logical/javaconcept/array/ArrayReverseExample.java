package org.logical.javaconcept.array;

import java.util.Arrays;

//12) Write a Java program to reverse an array without using an additional array?
public class ArrayReverseExample {
    public static void main(String[] args) {
        int[] reverseArray = reverseArray(new int[]{4, 5, 8, 9, 10});
        System.out.println(Arrays.toString(reverseArray));
    }

    private static int[] reverseArray(int[] inputNumber) {
        int temp = 0;
        for (int i = 0; i <= inputNumber.length/2; i++) {
            temp = inputNumber[i];
            inputNumber[i] = inputNumber[inputNumber.length - i-1];
            inputNumber[inputNumber.length -i -1] = temp;
        }
        return inputNumber;
    }
}

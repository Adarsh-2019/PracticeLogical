package org.logical.javaconcept.array;

//9) Write a Java program to find a missing number in an integer array?
public class MissingNumberInArray {
    public static void main(String[] args) {
        int n = 8;
        int[] array = {1, 4, 5, 3, 7, 8, 6};
        int sumOfNNumbers = sumOfNNumbers(n);
        int sumOfElements = sumOfElements(array);
        int missingNumber = sumOfNNumbers - sumOfElements;
        System.out.println("Missing number : "+missingNumber);
    }

    private static int sumOfElements(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }

    private static int sumOfNNumbers(int n) {
        int sum = (n * (n + 1)) / 2;

        return sum;
    }


}

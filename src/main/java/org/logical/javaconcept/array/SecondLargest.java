package org.logical.javaconcept.array;

//2) Write a Java program to find second largest element in an array of integers?
public class SecondLargest {
    public static void main(String[] args) {
        int numbers[] = {45, 51, 28, 75, 49, 42};
        int secondNumber = findSecondNumber(numbers);
        System.out.println("secondNumber: "+secondNumber);
    }

    private static int findSecondNumber(int[] inputNumber) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < inputNumber.length; i++) {
            if (inputNumber[i] > max) {
                secondMax=max;
                max=inputNumber[i];
            }else if(inputNumber[i]>secondMax && inputNumber[i] !=max){
                secondMax=inputNumber[i];
            }
        }
        return secondMax;
    }
}

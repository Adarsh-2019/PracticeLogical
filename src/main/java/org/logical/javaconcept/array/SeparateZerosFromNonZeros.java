package org.logical.javaconcept.array;

import java.util.Arrays;

//7) Write a Java program to separate zeros from non-zeros in an integer array?
public class SeparateZerosFromNonZeros {
    public static void main(String[] args) {
        int[] moveZerosToEnd = moveZerosToEnd(new int[]{12, 0, 7, 0, 8, 0, 3});
        System.out.println(Arrays.toString(moveZerosToEnd));
    }

    private static int[] moveZerosToEnd(int[] inputArray) {
       /* int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i]!=0){
                int temp=inputArray[i];
                inputArray[i]=inputArray[count];
                inputArray[count]=temp;
                count++;
            }
        }
        return inputArray;*/

//        int counter = inputArray.length - 1;
//        for (int i = inputArray.length - 1; i >= 0; i--) {
//            if (inputArray[i] != 0) {
//                inputArray[counter] = inputArray[i];
//                counter--;
//            }
//        }
//        while (counter >= 0) {
//            inputArray[counter] = 0;
//            counter--;
//        }
//        return inputArray;

        int counter=0;
        for (int i=0;i<inputArray.length;i++){
            if (inputArray[i]!=0){
                inputArray[counter]=inputArray[i];
                counter++;
            }
        }
        while (counter<inputArray.length){
            inputArray[counter]=0;
            counter++;
        }
        return inputArray;
    }
}

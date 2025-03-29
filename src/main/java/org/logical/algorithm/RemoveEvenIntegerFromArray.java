package org.logical.algorithm;

import java.util.Arrays;

public class RemoveEvenIntegerFromArray {
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 7, 10, 6, 5};
        int[] oddNumber = removeIntegers(array);
        System.out.println(Arrays.toString(oddNumber));
    }

    private static int[] removeIntegers(int[] array) {
        int count=0;
        for (int number : array) {
            if (number % 2 != 0) {
                count++;
            }
        }
        int[] result=new int[count];
        int index=0;
        for (int i=0;i<array.length;i++){
            if (array[i]%2!=0){
                result[index]=array[i];
                index++;
            }
        }
      return result;
    }
}

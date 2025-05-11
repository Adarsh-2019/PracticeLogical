package org.logical.array;

import java.util.Arrays;

public class PushZerosToEndArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 0, 4, 3, 0, 5, 0};
        int[] ints = pushZeroToEnd(array);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] pushZeroToEnd(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                int temp = array[i];
                array[i] = array[count];
                array[count] = temp;
                count++;
            }
        }
        return array;
    }

   /* private static int[] pushZeroToEnd(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
              array[count++]=array[i];
            }
        }
        while (count<array.length){
            array[count++]=0;
        }
        return array;
    }*/

}

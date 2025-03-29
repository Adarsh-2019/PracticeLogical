package org.logical.algorithm;

import java.util.Arrays;

public class BubbleSort {
    /*
    Bubble sort Worst case performance        O(n^2)
    Bubble sort Best case performance         O(n)
    Bubble sort Average case performance      O(n^2)
     */
    public static void main(String[] args) {
        bubbleSort(new int[]{20, 12, 45, 19, 91, 55});
        //bubbleSort(new int[] { -1, 0, 1 });
        //bubbleSort(new int[] { -3, -9, -2, -1 });
    }

    private static void bubbleSort(int[] numbers) {
        boolean swap = true;
        int last = numbers.length - 1;

        while (swap) {
            swap = false;
            for (int i = 0; i < last; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swap = true;
                }
            }
            last--;
        }
        System.out.println(Arrays.toString(numbers));
    }
}

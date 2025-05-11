package org.logical.array;

import java.util.Arrays;

public class ReverseInGroups {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        int[] ints = reverseInGroup(array, k);
        System.out.println(Arrays.toString(ints));
    }

    private static int[] reverseInGroup(int[] array, int k) {
        int n = array.length;
        for (int i = 0; i < array.length; i = i + k) {
            int left = i;
            int right = Math.max(i + k - 1, n - 1);

            while (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        return array;
    }
}

package org.logical.algorithm;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        System.out.println("mergesort");
        int[] input = { 87, 57, 370, 110, 90, 610, 02, 710, 140, 203, 150 };

        System.out.println("array before sorting");
        System.out.println(Arrays.toString(input));

        // sorting array using MergeSort algorithm
        mergesort(input,0,input.length-1);

        System.out.println("array after sorting using mergesort algorithm");
        System.out.println(Arrays.toString(input));
    }

    private static void mergesort(int[] input, int start, int end) {

        int mid = (start + end) / 2;
        if (start < end) {
            mergesort(input, start, mid);
            mergesort(input, mid + 1, end);
        }

        // merge solved pieces to get solution to original problem
        int i = 0, first = start, last = mid + 1;
        int[] tmp = new int[end - start + 1];

        while (first <= mid && last <= end) {
            tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
        }
        //sort from first to mid
        while (first <= mid) {
            tmp[i++] = input[first++];
        }
        //sort from mid+1 to end
        while (last <= end) {
            tmp[i++] = input[last++];
        }

        i = 0;
        while (start <= end) {
            input[start++] = tmp[i++];
        }
    }
}

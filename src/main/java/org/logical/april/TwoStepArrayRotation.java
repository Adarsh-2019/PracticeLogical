package org.logical.april;

public class TwoStepArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};//5 4 1 2 3
        rotateArrayByOne(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotateArrayByOne(int[] arr) {
        if (arr.length <= 1) return;
        int lastElement = arr[arr.length - 1];
        int secondElement = arr[arr.length - 2];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
        arr[1]=secondElement;
    }
}

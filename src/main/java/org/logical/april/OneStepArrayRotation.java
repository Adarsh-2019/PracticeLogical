package org.logical.april;

public class OneStepArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array
        rotateArrayByOne(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotateArrayByOne(int[] arr) {
        if (arr.length <= 1) return;
        int lastElement = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
    }
}

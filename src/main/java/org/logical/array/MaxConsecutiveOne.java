package org.logical.array;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        int maxConsecutive = findMaxConsecutive(arr);
        System.out.println("Max consecutive :" + maxConsecutive);
    }

    private static int findMaxConsecutive(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int maxCount = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }
        return Math.max(maxCount, count);
    }
}

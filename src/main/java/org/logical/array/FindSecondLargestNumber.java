package org.logical.array;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest number :" + secondLargest);

    }

    private static int findSecondLargest(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}

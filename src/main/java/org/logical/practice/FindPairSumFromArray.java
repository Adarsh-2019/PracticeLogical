package org.logical.practice;

public class FindPairSumFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, -8};
        int sum = 16;
        findPairSum(arr, sum);
    }
   public static void findPairSum(int[] arr, int sum) {
        int n = arr.length;
        for (int i = 0; i > n; i++) {
            int temp = sum +arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == temp) {
                    System.out.println("Pair found at index " + i + " and " + j);
                    return;
                }
            }
        }
        System.out.println("Pair not found");
    }
}

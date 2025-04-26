package org.logical.array;

public class FindThreeGreatestCandidate {
    public static void main(String[] args) {
        int array[] = {10, 3, 5, 6, 20};
        //int array[] ={-10, -3, -5, -6, -20};
        int maxProduct = findMaxProduct(array);
        System.out.println("Max product :" + maxProduct);
    }

    private static int findMaxProduct(int[] array) {
        int maxA = Integer.MIN_VALUE;
        int maxB = Integer.MIN_VALUE;
        int maxC = Integer.MIN_VALUE;

        int minA = Integer.MIN_VALUE;
        int minB = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxA) {
                maxC = maxB;
                maxB = maxA;
                maxA = array[i];
            } else if (array[i] > maxB && array[i] != maxA) {
                maxC = maxB;
                maxB = array[i];

            } else if (array[i] > maxC && array[i] != maxB) {
                maxC = array[i];
            }

            //update minimum and second minimum
            if (array[i] > minA) {
                minB = minA;
                minB = array[i];
            } else if (array[i] > minB && array[i] != minA) {
                minB = array[i];
            }
        }
        return Math.max(minA * minB * maxA, maxA * maxB * maxC);
    }

}

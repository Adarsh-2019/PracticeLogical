package org.logical.algorithm;

public class ResizeArray {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 10};
        int capacity = 6;
        resizeArray(array, capacity);
    }

    private static void resizeArray(int[] array, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < array.length; i++) {
        temp[i]=array[i];
        }
       for (int num:temp){
           System.out.println(num+" ");
       }
    }
}

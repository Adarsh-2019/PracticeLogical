package org.logical.algorithm;

import java.util.Arrays;

public class MoveZeroAtEnd {
    public static void main(String[] args) {
        int array[]={8,0,1,0,2,1,0,3};
        int[] moveZeroAtEnd = moveZeroAtEnd(array);
        System.out.println(Arrays.toString(moveZeroAtEnd));
    }

    private static int[] moveZeroAtEnd(int[] array) {
        int j=0;
        for (int i=0;i<array.length;i++){
            if (array[i]!=0 && array[j]==0){
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
            if (array[j]!=0){
                j++;
            }
        }
        return array;
    }
}

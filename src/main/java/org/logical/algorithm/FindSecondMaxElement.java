package org.logical.algorithm;

public class FindSecondMaxElement {
    public static void main(String[] args) {
        int[] array={13,34,2,34,33,1};
        int secondElement = findSecondElement(array);
        System.out.println("Second max element "+secondElement);
    }

    private static int findSecondElement(int[] array) {
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                secondMax=max;
                max=array[i];
            }else if (array[i]>secondMax && array[i]!=max){
                secondMax=array[i];
            }
        }
        return secondMax;
    }
}

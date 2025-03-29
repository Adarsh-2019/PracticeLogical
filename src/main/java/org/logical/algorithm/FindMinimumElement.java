package org.logical.algorithm;

public class FindMinimumElement {
    public static void main(String[] args) {
        int array[]={5,9,3,15,1,2,-23,-1,0};
        int minimumElement = minimumElement(array);
        System.out.println("Minimum element is "+minimumElement);
    }

    private static int minimumElement(int[] array) {

        int min=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
}

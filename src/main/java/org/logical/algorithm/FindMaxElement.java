package org.logical.algorithm;

public class FindMaxElement {
    public static void main(String[] args) {
        int array[]={5,9,3,15,1,2,-23,-1,0};
        int maxElement = minimumElement(array);
        System.out.println("Max element is "+maxElement);
    }

    private static int minimumElement(int[] array) {
        int max=0;
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}

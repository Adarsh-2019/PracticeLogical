package org.logical.practice;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {5, 3, 8, 4, 2};
        int smallest=0;
        for(int i=0;i<arr.length-1;i++){
            smallest=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            //swapping
            int temp=0;
            temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
        System.out.printf("Sorted array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

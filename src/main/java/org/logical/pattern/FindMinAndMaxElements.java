package org.logical.pattern;

public class FindMinAndMaxElements {
    public static void main(String[] args) {
        int arr[]={16,0,1,-12,28,-78,-1};
        findMaxAndMin(arr);
    }

    private static void findMaxAndMin(int[] arr) {
        int max=0,min=0;
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i]){
                min=arr[i];
            }
            else if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("min :"+min+"  max :"+max);
    }
}

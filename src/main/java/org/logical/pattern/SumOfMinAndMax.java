package org.logical.pattern;

public class SumOfMinAndMax {

    public static void main(String[] args) {
        int arr[]={17,6,5,1,2,-2};
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum is :"+sum);
        findMaxAndMin(arr,sum);
    }
    private static void findMaxAndMin(int[] arr, int totalSum) {
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
        System.out.println("Min :"+min+" max :"+max);
        System.out.println("Min sun :"+(totalSum-min)+"  Min sum :"+(totalSum-max));
    }
}

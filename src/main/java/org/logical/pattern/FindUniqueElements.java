package org.logical.pattern;

public class FindUniqueElements {
    public static void main(String[] args) {
        int[] arr={1,3,5,1,3,2,2,6,7,1,2};
        findUnique(arr);
    }

    private static void findUnique(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j){
                    count++;
                    break;
                }
            }
            if(count==1){
                System.out.print(arr[i]+",");
            }
        }
    }
}

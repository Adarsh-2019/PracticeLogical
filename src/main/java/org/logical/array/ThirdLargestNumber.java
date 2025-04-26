package org.logical.array;

public class ThirdLargestNumber {
    public static void main(String[] args) {
        int array[] = {1, 14, 2, 16, 10, 20};
        int thirdNumber = findThirdNumber(array);
        System.out.println("third number :"+thirdNumber);
    }

    private static int findThirdNumber(int[] input) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            if (input[i]>first){
                third=second;
                second=first;
                first=input[i];
            }else if (input[i]>second && input[i]!=first){
                third=second;
                second=input[i];
            }else if (input[i]>third && input[i]!=second){
                third=input[i];
            }
        }
        return third;
    }
}

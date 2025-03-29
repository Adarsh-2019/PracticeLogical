package org.logical.logicals;

public class FindSumOfDigitsByRecursive {
    public static void main(String[] args) {

        int sumOfDigits = findSumOfDigits(0);
        System.out.println(sumOfDigits);
    }

    private static int findSumOfDigits(int num) {
        int rem=0, sum=0;
        if(num==0){
            return sum;
        }
        return ((num%10)+findSumOfDigits(num/10));
    }
}

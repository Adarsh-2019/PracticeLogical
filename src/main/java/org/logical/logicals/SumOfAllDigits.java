package org.logical.logicals;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int num=327870908;
        sunOfDigits(num);
    }

    private static void sunOfDigits(int num) {
        int rem, sum=0;
        while(num>0){
            rem=num%10;
            sum+=rem;
            num/=10;
        }
        System.out.println("Sum of all digits of a number: "+sum);
    }
}

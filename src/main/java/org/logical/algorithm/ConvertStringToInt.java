package org.logical.algorithm;

public class ConvertStringToInt {
    public static void main(String[] args) {
        String str="123";
        convertStringToInt(str);
    }

    private static void convertStringToInt(String str) {
        int number = Integer.parseInt(str);
        sumOfDigits(number);
    }

    private static void sumOfDigits(int number) {
        int sum=0,res=0;
        while (number>0){
            res=number%10;
            sum=sum+res;
            number=number/10;
        }
        System.out.println(sum);
    }
}

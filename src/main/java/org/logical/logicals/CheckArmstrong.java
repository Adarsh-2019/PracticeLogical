package org.logical.logicals;

public class CheckArmstrong {
    public static void main(String[] args) {
        int num=9474;
        checkArmstrong(num);
    }

    private static void checkArmstrong(int num) {
       int sum=0, rem=0;
       int copyOfNumber=num;
       while(num>0) {
           rem = num % 10;
           sum += rem * rem * rem*rem;
           num = num / 10;
       }
       if(sum==copyOfNumber) {
           System.out.println("Armstrong number");
       }
       else
       {
           System.out.println("Not a Armstrong");
       }
    }
}

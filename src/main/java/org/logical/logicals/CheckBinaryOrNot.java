package org.logical.logicals;

public class CheckBinaryOrNot {
    public static void main(String[] args) {
        int number = 10001;
        isBinaryOrNot(number);
    }

    private static void isBinaryOrNot(int number) {
        boolean isBinary = true;
        int copyOfNumber = number;
        while (copyOfNumber != 0) {
            int temp=copyOfNumber%10;
            if(temp>1){
                isBinary=false;
                break;
            }
            else
            {
                copyOfNumber/=10;
            }
        }
        if(isBinary){
            System.out.println(number+" is binary number ..");
        }
        else {
            System.out.println(number+" is not a binary number !");
        }
    }
}

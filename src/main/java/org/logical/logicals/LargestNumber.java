package org.logical.logicals;

public class LargestNumber {
    public static void main(String[] args) {
        int lLessThanN = getLLessThanN(147286, 2);
        System.out.println(lLessThanN);
    }

    private static int getLLessThanN(int number, int digit) {

        char charAt = Integer.toString(digit).charAt(0);

        for(int i=number;i>0;i--){
            if(Integer.toString(i).indexOf(charAt)==-1){
                return i;
            }
        }
        return -1;
    }
}
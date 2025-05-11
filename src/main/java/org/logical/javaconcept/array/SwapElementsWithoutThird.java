package org.logical.javaconcept.array;

//How do you swap two numbers without using the third variable?
public class SwapElementsWithoutThird {
    /*public static void main(String[] args) {
        int a=10;
        int b=20;
        swapNumber(a,b);
    }

    private static void swapNumber(int a, int b) {
        System.out.println("Before swapping ...");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        a=a+b; //30
        b=a-b; //30-20
        a=a-b;//30-10
        System.out.println("After swapping ...");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }*/

    public static void main(String[] args) {
        String str1="Hello";
        String str2="Word";
        swapString(str1,str2);
    }

    private static void swapString(String str1, String str2) {
        System.out.println("Before swapping ...");
        System.out.println("First :"+str1 + " - "+" Second :"+str2);
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println("After swapping ...");
        System.out.println("First :"+str1 + " - "+" Second :"+str2);

    }
}

package org.logical.practice;

public class ReverseString {
    public static void main(String[] args) {
       /* StringBuilder str= new StringBuilder("hello");
        for (int i=0;i<str.length()/2;i++) {
            int front = str.length() - i - 1;
            int back = i;
            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);
            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
            }
        System.out.println(str);*/

       /* String str = "hello";
        char[] strArray = str.toCharArray();
        for (int i=0;i<strArray.length/2;i++) {
            int front = strArray.length - i - 1;
            int back = i;
            char frontChar = strArray[front];
            char backChar = strArray[back];
            strArray[front] = backChar;
            strArray[back] = frontChar;
        }
        System.out.println(new String(strArray));*/

       /* String str = "hello";
        for (int i=0;i<str.length();i++){
            System.out.print(str.charAt(str.length()-i-1));
        }*/
    }
}

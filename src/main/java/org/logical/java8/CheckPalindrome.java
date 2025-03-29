package org.logical.java8;

import java.util.stream.IntStream;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "ROTATOR";
        boolean isPalindrome = IntStream.range(0, str.length() / 2).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - 1 - i));
        if (isPalindrome){
            System.out.println(str+" is a palindrome");
        }else {
            System.out.println(str+" is not a palindrome");
        }
    }
}

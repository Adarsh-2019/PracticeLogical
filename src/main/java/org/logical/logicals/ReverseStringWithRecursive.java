package org.logical.logicals;

public class ReverseStringWithRecursive {
    public static void main(String[] args) {
        String str="java is the best for large application ";
        System.out.println( reverseString(str));
    }

    private static String reverseString(String str) {
        if(null==str||str.length()<=1){
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}

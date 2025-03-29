package org.logical.logicals;

public class CheckRotationOfString {
    public static void main(String[] args) {
        String str1="java";
        String str2="avaj1";
        checkString(str1, str2);
    }

    private static void checkString(String str1, String str2) {

        if(str1.length()!=str2.length()) {
            System.out.println("One is not rotation of two");
        }else {
            String str3=str1+str2;
            if(str3.contains(str2)){
                System.out.println("One is rotation of two");
            }else
            {
                System.out.println("One is not rotation of two");
            }
        }

    }
}

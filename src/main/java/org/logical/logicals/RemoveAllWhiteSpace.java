package org.logical.logicals;

public class RemoveAllWhiteSpace {
    public static void main(String[] args) {
        String str = "If you have " +
                "      best thought " +
                "to other   then you " +
                "give best from other also.";
        System.out.println(removeWhiteSpaces(str));
    }

    private static String removeWhiteSpaces(String str) {

       /*
       return str.replaceAll(" ","");
       */
        int n = str.length();
        String output="";
        char chars[]=str.toCharArray();
        for (int i = 0; i < n; i++) {
        if(chars[i]!=' '){
            output+=chars[i];
           }
        }
        return output;
    }
}

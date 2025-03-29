package org.logical.logicals;

public class ReverseString {

    public static void main(String[] args) {
        String reverseString = reverseString("Java is best for the complex web App");
        System.out.println(reverseString);
    }

    /*private static void reverseString(String str) {

        int n=str.length();
        char ch[]=str.toCharArray();
        for (int i=n-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }*/

    /*public static void reverseString(String str){
        String reverse=null;
       char[] chars=str.toCharArray();
       int end=chars.length-1;
       int start=0;
       while (start<end){
           char temp=chars[start];
           chars[start]=chars[end];
           chars[end]=temp;
           start++;
           end--;
       }
       reverse=new String(chars);
        System.out.println("Original String :"+str);  //Java is best for the complex web App
        System.out.println("After reverse :"+reverse); //ppA bew xelpmoc eht rof tseb si avaJ
    }*/

    public static String reverseString(String str) {
        String[] strings = str.split(" ");
        int end = strings.length - 1;
        /*System.out.println("Original String :"+str);
        System.out.print("After reverse String : ");
        for (int i = len; i >= 0; i--) {
            System.out.print(strings[i]+" ");
        }*/
        int start=0;
        while (start< end){
            String temp=strings[start];
            strings[start]=strings[end];
            strings[end]=temp;
            start++;
            end--;
        }
        return String.join(" ",strings);
    }

    /*
    public static String reverseString(String sentence) {
        char[] characters = sentence.toCharArray();
        int length = characters.length;

        int start = 0;
        for (int end = 0; end < length; end++) {
            if (characters[end] == ' ') {
                reverseString(characters, start, end - 1);
                start = end + 1;
            }
        }

        // Reverse the last word (or the only word if there's only one)
        reverseString(characters, start, length - 1);

        // Reverse the entire modified string
        reverseString(characters, 0, length - 1);

        return new String(characters);
    }

    public static void reverseString(char[] characters, int start, int end) {
        while (start < end) {
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;
            start++;
            end--;
        }
    }*/

}

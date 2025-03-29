package org.logical.pattern;

public class Pattern7 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {

        for(int i=n;i>=0;i--){
            for(int j=0;j<=i;j++){
           if(i==n || i==0) {
               System.out.print("*");
           }else if(j==1|| j==i)
               System.out.print(" ");
            }
            System.out.println();
        }
    }
}

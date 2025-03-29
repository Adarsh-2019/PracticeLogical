package org.logical.pattern;

public class Pattern8 {
    public static void main(String[] args) {
        int n=5;
        printPattern(n);
    }

    private static void printPattern(int n) {

        for (int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int p=2;p<=i;p++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

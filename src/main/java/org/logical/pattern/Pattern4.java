package org.logical.pattern;

public class Pattern4 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

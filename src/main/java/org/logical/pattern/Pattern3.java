package org.logical.pattern;

public class Pattern3 {
    public static void main(String[] args) {
        printPattern(5);
    }

    private static void printPattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

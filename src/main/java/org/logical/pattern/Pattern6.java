package org.logical.pattern;

public class Pattern6 {
    public static void main(String[] args) {
        PrintPattern(5);
    }

    private static void PrintPattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n || j==1|| j==n){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

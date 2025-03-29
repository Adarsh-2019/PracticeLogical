package org.logical.pattern;

import java.util.Scanner;

class Pattern1 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
        patterPrint(n);
    }

    private static void patterPrint(int n) {

        for(int i=0;i<n;i++){
            System.out.print("*");
        }
    }
}

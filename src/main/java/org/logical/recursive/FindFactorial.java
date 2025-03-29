package org.logical.recursive;

public class FindFactorial {
    public static void main(String[] args) {
       int n=5;
        int factorial = findFactorial(n);
        System.out.println(factorial);
    }

    private static int findFactorial(int n) {
        if(n==1){
            return n;
        }
        return n*findFactorial(n-1);
    }
}

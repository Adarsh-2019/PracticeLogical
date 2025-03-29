package org.logical.recursive;

public class fibonanciSeries {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(findFibonacci((i)));
        }
    }

    private static int findFibonacci(int n) {
        if (n <= 2)
            return 1;
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }

}

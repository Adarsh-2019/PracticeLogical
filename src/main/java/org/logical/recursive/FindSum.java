package org.logical.recursive;

public class FindSum {

    public static void main(String[] args) {
        int sum = sum(10);
        System.out.println("Sum is : "+sum);
    }

    public static int sum(int n) {
        if (n == 0) {
            return n;
        } else
            return n + sum(n - 1);
    }
}

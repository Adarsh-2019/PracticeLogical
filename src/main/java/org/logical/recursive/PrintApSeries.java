package org.logical.recursive;

public class PrintApSeries {

    public static void main(String[] args) {
        int n=10;
        int apSeries = findApSeries(2, n, 2);
        System.out.println("Ap series sum is : "+apSeries);
    }

    public static int findApSeries(int a, int n, int d) {
        if(n==1)
            return a;
       // return a+findApSeries(a+d,n-1,d);
        return a+(n-1)*d+findApSeries(a,n-1,d);
    }
}
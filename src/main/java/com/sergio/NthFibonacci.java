package com.sergio;

public class NthFibonacci {

    public int nthFibonacci(int n) {
        //return nthFibonacciRecursive(n);
        return nthFibonacciIterative(n);
    }

    private int nthFibonacciRecursive(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return nthFibonacci(n-1) + nthFibonacci(n-2);
        }
    }

    private int nthFibonacciIterative(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            int[] fibonacciArray = new int[n+1];
            fibonacciArray[1] = 1;
            for(int i = 2; i <= n; i++) {
                fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
            }
            return fibonacciArray[n];
        }
    }
}

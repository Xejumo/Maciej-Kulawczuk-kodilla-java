package com.example.kodilla.spring.portfolio;

public class FibonacciCalculator {

    public int calculateFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N must be a non-negative integer.");
        }

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}

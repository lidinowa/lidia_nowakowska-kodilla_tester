package com.kodilla.basic_assertion;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int toSquare(int a) {
        return (int) Math.pow(a, 2);
    }

    public double subtractForDouble(double a, double b) {
        return a - b;
    }

    public double toSquareForDouble(double a) {

        return Math.pow(a, 2);
    }
}
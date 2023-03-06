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

    public double subtract(double a, double b) {    //przeciążenie metody testSubstract
        return a - b;
    }

    public double toSquare(double a) {
        return Math.pow(a, 2);
    }
}
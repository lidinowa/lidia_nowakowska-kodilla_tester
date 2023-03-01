package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        System.out.println("Wynik to: " + sumResult);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a, b);
        boolean correctSubtract = ResultChecker.assertEquals(-3, subtractResult);
        System.out.println("Wynik to: " + subtractResult);
        if (correctSubtract) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int toSquareResult = calculator.toSquare(a);
        boolean correctSquare = ResultChecker.assertEquals(25, toSquareResult);
        System.out.println("Wynik to: " + toSquareResult);
        if (correctSquare) {
            System.out.println("Metoda toSquare działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda toSquare nie działa poprawnie dla liczby " + a);
        }
    }
}
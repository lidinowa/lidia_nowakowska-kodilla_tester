package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    Calculator calculator;
    int a, b;
    double c, d,  e, f, g;

    @BeforeEach // lub @BeforeAll
    public void setUp() {
        calculator = new Calculator();
        a = 5;
        b = 8;
        c = 5.8;
        d = 5.6;
        e = 5.1;
        f = -1.2;
        g = 0;
    }

    @Test
    public void testSum() {
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
        System.out.println("Sum is " + sumResult);
    }

    @Test
    public void testSubstract(){
        double substractResult = calculator.subtract(c,d);
        Assertions.assertEquals(0.2,substractResult,0.1);
        System.out.println("Substract result is: " + substractResult);
    }

    @Test
    public void testToSquare(){
        double toSquareResultPositiveValue = calculator.toSquare(e);
        double toSquareResultNegativeValue = calculator.toSquare(f);
        double toSquareResultZeroValue = calculator.toSquare(g);
        System.out.println("Result for calculation positive value to square is " + toSquareResultPositiveValue);
        System.out.println("Result for calculation negative value to square is " + toSquareResultNegativeValue);
        System.out.println("Result for calculation zero value to square is " + toSquareResultZeroValue);
        Assertions.assertEquals(26.01,toSquareResultPositiveValue,0.1);
        Assertions.assertEquals(1.44,toSquareResultNegativeValue,0.1);
        Assertions.assertEquals(0,toSquareResultZeroValue,0.1);
    }
}
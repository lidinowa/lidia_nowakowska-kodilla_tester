package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
        System.out.println("Sum is " + sumResult);
    }
    @Test
    public void testSubstract(){
        Calculator calculator2 = new Calculator();
        double a = 5.8;
        double b = 5.6;
        double substractResult = calculator2.subtractForDouble(a,b);
        Assertions.assertEquals(0.2,substractResult,0.1);
        System.out.println("Substract result is: " + substractResult);
    }
    @Test
    public void testToSquare(){
        Calculator calculator3 = new Calculator();
        double a = 5.1;
        double b = -1.2;
        double c = 0;
        double toSquareResultPositiveValue = calculator3.toSquareForDouble(a);
        double toSquareResultNegativeValue = calculator3.toSquareForDouble(b);
        double toSquareResultZeroValue = calculator3.toSquareForDouble(c);
        System.out.println("Result for calculation positive value to square is " + toSquareResultPositiveValue);
        System.out.println("Result for calculation negative value to square is " + toSquareResultNegativeValue);
        System.out.println("Result for calculation zero value to square is " + toSquareResultZeroValue);
        Assertions.assertEquals(26.01,toSquareResultPositiveValue,0.1);
        Assertions.assertEquals(1.44,toSquareResultNegativeValue,0.1);
        Assertions.assertEquals(0,toSquareResultZeroValue,0.1);
    }
}
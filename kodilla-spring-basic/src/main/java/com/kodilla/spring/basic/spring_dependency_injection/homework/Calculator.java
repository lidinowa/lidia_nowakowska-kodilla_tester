package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b){
        double result = a + b;
        display.display(result);
        return result;
    }

    public double substract(double a, double b){
        double result = a - b;
        display.display(result);
        return result;
    }

    public double multiplay(double a, double b){
        double result = a * b;
        display.display(result);
        return result;
    }

    public double divide(double a, double b){
        double result = a / b;
        display.display(result);
        return result;
    }
}
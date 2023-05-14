package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldReturnCorrectResultForAdd(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculatorBean = context.getBean(Calculator.class);
        double result = calculatorBean.add(4,2.5);
        assertEquals(6.5, result);
    }

    @Test
    public void shouldReturnCorrectResultForSubstract(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculatorBean = context.getBean(Calculator.class);
        double result = calculatorBean.substract(4.5,0.5);
        assertEquals(4.0, result);
    }

    @Test
    public void shouldReturnCorrectResultForMultiplay(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculatorBean = context.getBean(Calculator.class);
        double result = calculatorBean.multiplay(1,2.5);
        assertEquals(2.5, result);
    }

    @Test
    public void shouldReturnCorrectResultForDivide(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator calculatorBean = context.getBean(Calculator.class);
        double result = calculatorBean.divide(4,2);
        assertEquals(2.0, result);
    }
}
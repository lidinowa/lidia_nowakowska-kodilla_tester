package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
    ShippingCenter shippingCenterBean = context.getBean(ShippingCenter.class);

    @Test
    public void shouldReturnCorrectResultForTrue() {
        String result = shippingCenterBean.sendPackage("Test address", 20.0);
        assertEquals("Package delivered to: Test address", result);
    }

    @Test
    public void shouldReturnCorrectResultForFalse() {

        String result = shippingCenterBean.sendPackage("Test address", 35.0);
        assertEquals("Package not delivered to: Test address", result);
    }
}
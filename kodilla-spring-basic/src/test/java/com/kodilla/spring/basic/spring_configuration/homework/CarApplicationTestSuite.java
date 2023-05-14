package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;


@SpringBootTest
class CarApplicationTestSuite {

    @Test
    public void shouldCreateRandomCar() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("randomCar");
        String carTypeForSeason = car.getCarType();
        System.out.println(carTypeForSeason);
        List<String> result = Arrays.asList("Sedan", "Cabrio", "SUV");
        Assertions.assertTrue(result.contains(carTypeForSeason));
    }

    @Test
    public void checkLightsOnOff() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("randomCar");
        boolean resultLights = car.hasHeadlightsTurnedOn();
        System.out.println(resultLights);
        Assertions.assertNotNull(resultLights);
    }
}
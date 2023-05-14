package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class CarApplication {

    private Random random = new Random();


    @Bean
    public Car randomCar(){
        Car car;
        Random generator = new Random();
        int random = generator.nextInt(4);
        if(random == 2 || random == 3){
            car = new Sedan();
        } else if (random == 1){
            car = new SUV();
        } else {
            car = new Cabrio();
        }
        return car;
    }
}
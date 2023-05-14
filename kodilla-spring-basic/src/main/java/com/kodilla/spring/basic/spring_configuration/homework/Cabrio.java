package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;
import java.util.Random;

public class Cabrio implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn() {
        Random timeGenerator = new Random();
        int hour = timeGenerator.nextInt(23);
        int minutes = timeGenerator.nextInt(59);
        LocalTime time = LocalTime.of(hour, minutes);
        System.out.println(time);
        if (time.isBefore(LocalTime.of(20, 0)) && time.isAfter(LocalTime.of(6, 0))) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
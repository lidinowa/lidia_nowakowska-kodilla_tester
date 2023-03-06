package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volvo;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("-----------------------------");
        System.out.println("Car name: " + getCarName(car));
        System.out.println("Car increased speed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Ferrari)
            return "Ferrari";
        else if (car instanceof Volvo)
            return "Volvo";
        else if ( car instanceof Toyota)
            return "Toyota";
        else
            return "Unknown brand name";
    }
}
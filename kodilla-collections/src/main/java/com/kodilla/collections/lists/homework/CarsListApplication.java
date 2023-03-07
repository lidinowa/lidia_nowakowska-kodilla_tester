package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        Ferrari ferrari = new Ferrari(100);
        Volvo volvo = new Volvo(80);
        Toyota toyota = new Toyota(70);

        carList.add(ferrari);   // removed
        carList.add(volvo);  // 1
        carList.add(toyota);  // removed
        carList.add(new Toyota(50));  // 2
        carList.add(new Toyota(40));  // 3

        carList.remove(0);
        carList.remove(toyota);

        System.out.println("Number of cars in the list: " + carList.size());

        for (Car car : carList){
            CarUtils.describeCar(car);
        }
    }
}
package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ferrari;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.Random;

public class CarApplication {

    private static final Random random = new Random();

    public static void main(String[] args) {

        int howManyCars = random.nextInt(16) +1;
        System.out.println("Number of cars: " + howManyCars);

        Car carList[] = new Car[howManyCars];

        for (int n = 0; n < carList.length; n++)
            carList[n] = drawCar();

        for (Car car : carList)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        int drawCarType = random.nextInt(3);
        int drawSpeed = random.nextInt(120);
        if (drawCarType == 0)
            return new Ferrari(drawSpeed);
        else if (drawCarType == 1)
            return new Volvo(drawSpeed);
        else if (drawCarType == 2)
            return new Toyota(drawSpeed);
        return drawCar();
    }
}
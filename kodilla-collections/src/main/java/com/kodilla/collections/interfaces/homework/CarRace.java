package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari(0);
        Volvo volvo = new Volvo(0);
        Toyota toyota = new Toyota(0);
        doRace(ferrari);
        doRace(volvo);
        doRace(toyota);
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Speed of " + car.getCarName() + " is " + car.getSpeed());

    }
}

//    inna metoda użyta - public void:

//    public static void main(String[] args) {
//
//        Ferrari ferrari = new Ferrari();
//        Volvo volvo = new Volvo();
//        Toyota toyota = new Toyota();
//
//        CarRace carRace = new CarRace();
//
//        carRace.doRace(ferrari);
//        carRace.doRace(volvo);
//        carRace.doRace(toyota);
//    }
//
//    public void doRace(Car car) {
//        car.increaseSpeed();
//        car.increaseSpeed();
//        car.increaseSpeed();
//        car.decreaseSpeed();
//        car.decreaseSpeed();
//        System.out.println("Speed of " + car.getCarName() + " is " + car.getSpeed());
//    }
//}
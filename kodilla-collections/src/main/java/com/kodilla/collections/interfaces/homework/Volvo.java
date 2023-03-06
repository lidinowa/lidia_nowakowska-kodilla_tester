package com.kodilla.collections.interfaces.homework;

public class Volvo implements Car {

    private int speed;
    private String name = "Volvo";

    public Volvo(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 30;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 20;
    }

    @Override
    public String getCarName() {
        return name;
    }
}
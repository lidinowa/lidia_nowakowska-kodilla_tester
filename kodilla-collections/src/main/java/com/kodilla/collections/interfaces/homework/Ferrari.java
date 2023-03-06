package com.kodilla.collections.interfaces.homework;

public class Ferrari implements Car{

    private int speed;

    private String name = "Ferrari";

    public Ferrari(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 40;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 10;
    }

    @Override
    public String getCarName() {
        return name;
    }
}
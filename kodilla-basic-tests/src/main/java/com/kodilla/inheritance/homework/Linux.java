package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    private String nameOfSystem = "Linux";
    private String nameOfUser;

    public Linux(int year, String nameOfUser) {
        super(year);
        this.nameOfUser = nameOfUser;
    }

    @Override
    public void turnOn() {
        System.out.println("System " + nameOfSystem + " turned on");
    }

    public void openBash() {
        System.out.println("Bash is opened for " + nameOfUser);
    }

    public void getNameOfUser() {
        System.out.println("You are logged in as a " + nameOfUser);
    }
}
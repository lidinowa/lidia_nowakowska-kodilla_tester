package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    private String nameOfSystem = "Windows";

    public Windows(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("System " + nameOfSystem + " turned on");
    }

    public void openPowerShell() {
        System.out.println("Powershell is opened");
    }
}
package com.kodilla.inheritance.homework;

public class ApplicationTest {
    public static void main(String[] args) {
        Windows windows = new Windows(1998);
        windows.turnOn();
        windows.openPowerShell();
        windows.turnOff();
        System.out.println("System is from " + windows.getYear() + " year");

        Linux linux = new Linux(2000,"Superuser");
        linux.turnOn();
        linux.openBash();
        linux.turnOff();
        linux.getNameOfUser();
        System.out.println("System is from " + linux.getYear() + " year");
    }
}
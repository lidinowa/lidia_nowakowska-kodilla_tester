package com.kodilla.abstracts.homework;

public class ApplicationJob {

    public static void main(String[] args) {

        TaxiDriver taxiDriver = new TaxiDriver();
        Teacher teacher = new Teacher();

        Person person1 = new Person("Joel", 40, taxiDriver);
        Person person2 = new Person("Jane", 35, teacher);


        person1.displayResponsibilities();
        person2.displayResponsibilities();

    }
}

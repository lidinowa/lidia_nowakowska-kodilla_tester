package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void displayResponsibilities() {
        //   System.out.println(firstName + "works as a " + job + "and the responsibilities at this job is " + job.getResponsibilities());
        //   to powyżej drukuje Joelworks as a com.kodilla.abstracts.homework.TaxiDriver@13221655and the responsibilities at this job is Driving people
        System.out.println(firstName + " has the responsibilities like: " + job.getResponsibilities());


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
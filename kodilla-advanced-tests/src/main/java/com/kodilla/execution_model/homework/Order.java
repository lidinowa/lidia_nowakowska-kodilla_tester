package com.kodilla.execution_model.homework;

import java.time.LocalDate;


public class Order {

    private double orderValue;
    private String login;
    LocalDate localDate;


    public Order(double orderValue, LocalDate localDate, String login) {
        this.orderValue = orderValue;
        this.localDate = localDate;
        this.login = login;
    }


    public double getOrderValue() {
        return orderValue;
    }

    public String getLogin() {
        return login;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
}
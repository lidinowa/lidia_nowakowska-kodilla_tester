package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


public class Shop {

    public List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public int checkHowManyOrders() {
        return orders.size();
    }

    public double sumOfOrders() {
        int sumOfOrders = 0;
        for (Order orderExample : orders) {
            sumOfOrders += orderExample.getOrderValue();
        }
        return sumOfOrders;
    }

    public List<Order> getOrdersBetweenGivenDates(LocalDate start, LocalDate end) {
        List<Order> result = new ArrayList<>();
        for (Order orderExample : orders){
            if (orderExample.getLocalDate().isAfter(start) && orderExample.getLocalDate().isBefore(end)){
                result.add(orderExample);
            }
        }
        return result;
    }

    public List<Order> getOrdersBetweenGivenOrderValues(double fromValue, double toValue){
        List<Order> result = new ArrayList<>();
        for (Order orderExample : orders){
            if(orderExample.getOrderValue() > fromValue && orderExample.getOrderValue() < toValue){
                result.add(orderExample);
            }
        }
        return result;
    }

    public double theBiggestOrder(){
        return orders.stream().mapToDouble(u -> u.getOrderValue()).max().orElseThrow(NoSuchElementException::new);
    }

    public double theSmallestOrder(){
        return orders
                .stream()
                .mapToDouble(u -> u.getOrderValue())
                .min()
                .orElseThrow(NoSuchElementException::new);
    }

//    public List<Order> getOrdersBetweenGivenDates2(LocalDate from, LocalDate to){
//        return orders
//                .stream()
//                .filter(d -> d.getLocalDate().isAfter(from)&& d.getLocalDate().isBefore(to))
//                .collect(Collectors.toList());
//    }
}
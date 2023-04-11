package com.kodilla.exepction.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
//        Order order = orderList
//                .stream()
//                .filter(order1 -> order1.getNumber().equals(number))
//                .findFirst().get();

        Order order = orderList
                .stream()
                .filter(order1 -> order1.getNumber().equals(number)).findFirst().orElseThrow(OrderDoesntExistException::new);
        return order;
    }
}
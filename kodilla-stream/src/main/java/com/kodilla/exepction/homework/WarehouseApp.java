package com.kodilla.exepction.homework;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("100"));
        warehouse.addOrder(new Order("101"));
        warehouse.addOrder(new Order("102"));
        warehouse.addOrder(new Order("103"));

        try {
            warehouse.getOrder("107");
            System.out.println("Order found");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order does not exist");
        }
    }
}
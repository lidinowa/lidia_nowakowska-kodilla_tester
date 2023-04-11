package com.kodilla.exepction.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    Warehouse warehouse = new Warehouse(); //not possible to warehouse.addOrder in this place

    @Test
    public void checkExistingOrder() throws OrderDoesntExistException {
        //when
        warehouse.addOrder(new Order("100"));
        warehouse.addOrder(new Order("101"));
        //then
        assertEquals(warehouse.getOrder("100").getNumber(),"100");
    }

    @Test
    public void checkIfTheOrderExists() throws OrderDoesntExistException {
        //when
        warehouse.addOrder(new Order("100"));
        warehouse.addOrder(new Order("101"));
        //then
        assertNotNull(warehouse.getOrder("100"));
    }

    @Test
    public void checkNotExistingOrder(){
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("100"));
    }
}
package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order order1 = new Order(20, LocalDate.of(2023, Month.MARCH, 20), "Anna");
    Order order2 = new Order(30, LocalDate.of(2023, Month.JANUARY, 10), "Anna");
    Order order3 = new Order(40, LocalDate.of(2023, Month.APRIL, 1), "Jan");
    Order order4 = new Order(50, LocalDate.of(2023, Month.FEBRUARY, 2), "Basia");

    @BeforeEach
    public void dataSetUp() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
    }

    @Test
    public void shouldAddNewOrder() {
        shop.addOrder(new Order(60, LocalDate.of(2022, Month.MAY, 3), "Ela"));
        assertEquals(5, shop.checkHowManyOrders());
    }

    @Test
    public void shouldReturnNumberOfOrders() {
        assertEquals(4, shop.checkHowManyOrders());
    }

    @Test
    public void shouldReturnSumOfAllOrders() {
        assertEquals(140, shop.sumOfOrders());
    }

    @Test
    public void shouldProvideTheSmallestOrder() {
        assertEquals(20, shop.theSmallestOrder());
    }

    @Test
    public void shouldProvideTheBiggestOrder() {
        assertEquals(50, shop.theBiggestOrder());
    }

    @Test
    public void shouldProvideOrdersFromGivenDateRange(){
        assertEquals(2, shop.getOrdersBetweenGivenDates(LocalDate.of(2023,Month.MARCH,1),
                LocalDate.of(2023,Month.JUNE,30)).size());
    }

    @Test
    public void shouldProvideOrdersFromGivenOrderValue(){
        assertEquals(2, shop.getOrdersBetweenGivenOrderValues(5,35).size());
    }
}
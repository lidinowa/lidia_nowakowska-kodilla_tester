package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void getSurfaceArea() {
        int surfaceArea = a * b;
        System.out.println("Surface area of rectangle is " + surfaceArea);
    }

    @Override
    public void getPerimeter() {
        int perimeter = 2 * a + 2 * b;
        System.out.println("Perimeter of rectangle is " + perimeter);
    }
}
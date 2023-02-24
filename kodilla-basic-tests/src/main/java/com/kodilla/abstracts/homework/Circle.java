package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    private int r;
    private final double PI = 3.14;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void getSurfaceArea() {
        double surfaceArea = PI * r * r;
        System.out.println("Surface area of circle is " + surfaceArea);
    }

    @Override
    public void getPerimeter() {
        double perimeter = 2 * PI * r;
        System.out.println("Perimeter of circle is " + perimeter);
    }
}
package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.getSurfaceArea();
        rectangle.getPerimeter();

        Circle circle = new Circle(3);
        circle.getSurfaceArea();
        circle.getPerimeter();
    }
}

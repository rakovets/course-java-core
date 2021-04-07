package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Point firstPoint = new Point(10, 10);
        Point secondPoint = new Point(20, 20);
        Rectangle rectangle = new Rectangle(firstPoint, secondPoint);
        System.out.printf("%f\n", rectangle.getPerimeter());
        System.out.printf("%f\n", rectangle.getArea());
        firstPoint.setX(10);
        firstPoint.setY(10);
        secondPoint.setX(30);
        secondPoint.setY(30);
        System.out.printf("%f\n", rectangle.getPerimeter());
        System.out.printf("%f\n", rectangle.getArea());
    }
}

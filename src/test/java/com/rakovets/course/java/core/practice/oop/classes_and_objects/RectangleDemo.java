package com.rakovets.course.java.core.practice.oop.classes_and_objects;

import java.awt.geom.Area;

public class RectangleDemo {
    public static void main(String[] args) {
        Point firstPoint = new Point(45, 28);
        Point secondPoint = new Point(32, 20);
        Point thirdPoint = new Point(125, 65.5);
        System.out.printf("Coordinates firstPoint - x = %f, y = %f\n", firstPoint.getX(), firstPoint.getY());
        System.out.printf("Coordinates secondPoint - x = %f, y = %f\n", secondPoint.getX(), secondPoint.getY());
        System.out.printf("Coordinates thirdPoint - x = %f, y = %f\n", thirdPoint.getX(), thirdPoint.getY());
        Rectangle rectangle = new Rectangle(firstPoint, secondPoint);
        System.out.printf("Perimeter1 - %f\n", rectangle.getPerimeter());
        System.out.printf("Area1 - %f\n", rectangle.getArea());
        firstPoint.setX(50);
        firstPoint.setY(30);
        secondPoint.setX(20);
        secondPoint.setY(75);
        thirdPoint.setX(100);
        thirdPoint.setY(70.5);
        System.out.printf("Perimeter2 - %f\n", rectangle.getPerimeter());
        System.out.printf("Area2 - %f\n", rectangle.getArea());
        Rectangle rectangle1 = new Rectangle(firstPoint, thirdPoint);
        System.out.printf("Perimeter3 - %f\n", rectangle1.getPerimeter());
        System.out.printf("Area3 - %f\n", rectangle1.getArea());
    }
}

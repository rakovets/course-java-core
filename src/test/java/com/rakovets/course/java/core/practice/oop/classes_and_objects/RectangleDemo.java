package com.rakovets.course.java.core.practice.oop.classes_and_objects;

import java.awt.geom.Area;

public class RectangleDemo {
    public static void main(String[] args) {
        Point firstPoint = new Point(45, 28);
        Point secondPoint = new Point(32, 20);
        System.out.printf("Coordinates firstPoint - x = %f, y = %f\n", firstPoint.getX(), firstPoint.getY());
        System.out.printf("Coordinates secondPoint - x = %f, y = %f\n", secondPoint.getX(), secondPoint.getY());
        Rectangle rectangle = new Rectangle(firstPoint, secondPoint);
        System.out.printf("Perimeter1 - %f\n", rectangle.getPerimeter());
        System.out.printf("Area1 - %f\n", rectangle.getArea());
        firstPoint.setX(50);
        firstPoint.setY(30);
        secondPoint.setX(20);
        secondPoint.setY(75);
        System.out.printf("Perimeter2 - %f\n", rectangle.getPerimeter());
        System.out.printf("Area2 - %f\n", rectangle.getArea());
    }
}

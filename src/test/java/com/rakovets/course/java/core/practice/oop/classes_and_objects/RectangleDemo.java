package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Point firstPoint = new Point(12.5, 0);
        Point secondPoint = new Point(40,10.5);
        Rectangle rectangle = new Rectangle(firstPoint, secondPoint);

        System.out.println("First rectangle:");
        System.out.printf("First point:\n%s", rectangle.getFirstPoint());
        System.out.printf("Second point:\n%s", rectangle.getSecondPoint());
        System.out.printf("Perimeter=%f\n", rectangle.getPerimeter());
        System.out.printf("Area=%f\n", rectangle.getArea());

        Point thirdPoint = new Point(10, 10);
        Point fourthPoint = new Point(100, 100);
        rectangle.setFirstPoint(thirdPoint);
        rectangle.setSecondPoint(fourthPoint);

        System.out.println("\nSecond rectangle:");
        System.out.printf("First point:\n%s", rectangle.getFirstPoint());
        System.out.printf("Second point:\n%s", rectangle.getSecondPoint());
        System.out.printf("Perimeter=%f\n", rectangle.getPerimeter());
        System.out.printf("Area=%f\n", rectangle.getArea());
    }
}

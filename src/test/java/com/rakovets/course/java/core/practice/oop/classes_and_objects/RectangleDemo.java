package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.printf("Start value:\nFirst point = %s\nSecond point = %s\n", rectangle.getFirstPoint(),
                rectangle.getSecondPoint());
        System.out.printf("Perimeter = %s\nArea = %s\n", rectangle.getPerimeter(), rectangle.getArea());
        rectangle.setFirstPoint(18.34);
        rectangle.setSecondPoint(34.25);
        System.out.printf("New value:\nFirst point = %s\nSecond point = %s\n", rectangle.getFirstPoint(),
                rectangle.getSecondPoint());
        System.out.printf("Perimeter = %s\nArea = %s", rectangle.getPerimeter(), rectangle.getArea());
    }
}

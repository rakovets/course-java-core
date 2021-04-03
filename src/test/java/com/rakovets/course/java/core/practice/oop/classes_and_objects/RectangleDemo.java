package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.printf("Start value:\nFirst point = %f\nSecond point = %f\n", rectangle.getFirstPoint(),
                rectangle.getSecondPoint());
        System.out.printf("Perimeter = %f\nArea = %f\n", rectangle.getPerimeter(), rectangle.getArea());
        rectangle.setFirstPoint(18.34);
        rectangle.setSecondPoint(34.25);
        System.out.printf("New value:\nFirst point = %f\nSecond point = %f\n", rectangle.getFirstPoint(),
                rectangle.getSecondPoint());
        System.out.printf("Perimeter = %f\nArea = %f", rectangle.getPerimeter(), rectangle.getArea());
    }
}

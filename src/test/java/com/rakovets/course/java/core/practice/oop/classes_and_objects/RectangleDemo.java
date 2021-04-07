package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 20);
        System.out.printf("First point = %s\nSecond point = %s\n\n", rectangle.getFirstPoint(),rectangle.getSecondPoint());
        System.out.printf("Rectangle perimeter = %s\nRectangle area = %s\n", rectangle.getPerimeter(), rectangle.getArea());
    }
}

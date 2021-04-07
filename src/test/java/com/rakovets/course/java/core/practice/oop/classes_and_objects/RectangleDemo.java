package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 20);
        System.out.printf("\nFirst point = %s\nSecond point = %s\n", rectangle.getFirstPoint(),rectangle.getSecondPoint());
        System.out.printf("Rectangle perimeter = %s\nRectangle area = %s\n", rectangle.getPerimeter(), rectangle.getArea());
        rectangle.setFirstPoint(370);
        rectangle.setSecondPoint(565);
        System.out.printf("\nFirst point = %s\nSecond point = %s\n", rectangle.getFirstPoint(),rectangle.getSecondPoint());
        System.out.printf("Rectangle perimeter = %s\nRectangle area = %s\n", rectangle.getPerimeter(), rectangle.getArea());
    }
}

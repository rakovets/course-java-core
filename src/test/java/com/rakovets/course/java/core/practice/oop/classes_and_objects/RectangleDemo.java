package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7, 11);
        System.out.printf("firstPoint = %f\nsecondPoint = %f\n", rectangle.getFirstPoint(), rectangle.getSecondPoint());
        System.out.printf("perimeter = %f\n", rectangle.getPerimeter());
        System.out.printf("area = %f\n", rectangle.getArea());
        rectangle.setFirstPoint(12.34);
        rectangle.setSecondPoint(43.21);
        System.out.printf("firstPoint 1 = %f\nsecondPoint 1 = %f\n", rectangle.getFirstPoint(), rectangle.getSecondPoint());
        System.out.printf("perimeter 1 = %f\narea 1 = %f\n", rectangle.getPerimeter(), rectangle.getArea());
    }
}

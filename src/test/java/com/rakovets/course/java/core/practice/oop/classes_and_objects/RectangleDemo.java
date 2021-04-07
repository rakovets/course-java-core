package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Point firstPoint = new Point(1,1);
        Point secondPoint = new Point(5,4);
        Rectangle rectangle = new Rectangle(firstPoint, secondPoint);
        System.out.println(rectangle.gerPerimeter(rectangle));
        System.out.println(rectangle.getArea(rectangle));
    }
}

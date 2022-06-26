package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class RectangleApplication {
    public static void main(String[] args) {
        Point topLeftPoint = new Point(2, 15);
        Point bottomRightPoint = new Point(10, 7);
        Rectangle rectangle = new Rectangle(topLeftPoint, bottomRightPoint);

        System.out.println("This Perimeter: " + rectangle.getDistance());
        System.out.println("This Area: " + rectangle.getArea());
    }
}

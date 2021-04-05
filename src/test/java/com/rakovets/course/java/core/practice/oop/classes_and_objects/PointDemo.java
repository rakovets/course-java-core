package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point point1 = new Point(23.5, 21);
        System.out.println("First point coordinate value:");
        System.out.printf("x=%f; y=%f\n", point1.getX(), point1.getY());

        point1.setX(20.5);
        point1.setY(24.77);
        System.out.println("The new coordinate value of the first point:");
        System.out.printf("x=%f; y=%f\n", point1.getX(), point1.getY());

        Point point2 = new Point(30.5, 24.77);
        System.out.println("Second point coordinate value:");
        System.out.printf("x=%f; y=%f\n", point2.getX(), point2.getY());
        System.out.printf("Distance between two points = %f\n", point1.getDistance(point2));
    }
}

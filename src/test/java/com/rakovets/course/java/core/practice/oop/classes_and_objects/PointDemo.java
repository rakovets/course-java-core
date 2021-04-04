package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point point = new Point(5, 8);
        Point newPoint = new Point(10, 25);
        System.out.printf("Coordinates point - x = %f, y = %f\n", point.getX(), point.getY());
        System.out.printf("Coordinates newPoint - x = %f, y = %f\n", newPoint.getX(), newPoint.getY());
        newPoint.setX(20);
        newPoint.setY(30);
        System.out.printf("Coordinates newPoint - x = %f, y = %f\n", newPoint.getX(), newPoint.getY());
        System.out.printf("Distance - %f\n", point.getDistance(newPoint));
    }
}

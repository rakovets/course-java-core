package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point point = new Point(10,10);
        System.out.printf("Current point X: %d Y: %d\n", point.getX(), point.getY());
        Point point1 = new Point(20,30);
        System.out.printf("Distance: %f\n", point.getDistance(point1));
        point1.setX(25);
        point1.setY(50);
        System.out.printf("Distance: %f", point.getDistance(point1));
    }
}

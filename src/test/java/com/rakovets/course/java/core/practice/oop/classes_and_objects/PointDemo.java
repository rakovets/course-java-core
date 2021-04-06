package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point point1 = new Point(7, 8);
        Point point2 = new Point(15, 20);
        System.out.printf("x1 = %f, y1 = %f\n", point1.getX(), point1.getY());
        System.out.printf("Distance: %f\n", point1.getDistance(point2));
        point2.setX(24.5);
        point2.setY(28.5);
        System.out.printf("x2 = %f, y2 = %f\n", point2.getX(), point2.getY());
        System.out.printf("Distance: %f\n", point1.getDistance(point2));
    }
}

package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        Point point1 = new Point(5, 7);
        System.out.printf("%f\n", point.getDistance(point1));
        System.out.printf("x1 = %f y1 = %f\n", point.getX(), point.getY());
        point1.setX(3);
        point1.setY(8);
        System.out.printf("x2 = %f y2 = %f\n", point1.getX(), point1.getY());
        System.out.printf("%f\n", point.getDistance(point1));
    }
}

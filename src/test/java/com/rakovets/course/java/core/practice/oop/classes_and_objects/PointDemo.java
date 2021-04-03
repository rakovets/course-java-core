package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point point1 = new Point(10, 5);
        Point point2 = new Point(12, 30);
        System.out.printf("Start value:\nX1 = %f\nY1 = %f\n", point1.getX(), point1.getY());
        System.out.printf("X2 = %f\nY2 = %f\n", point2.getX(), point2.getY());
        System.out.printf("distance = %f\n", point1.getDistance(point2));
        point1.setX(23.24);
        point1.setY(41.12);
        point2.setX(83.34);
        point2.setY(78.98);
        System.out.printf("New value:\nX1 = %f\nY1 = %f\n", point1.getX(), point1.getY());
        System.out.printf("X2 = %f\nY2 = %f\n", point2.getX(), point2.getY());
        System.out.printf("distance = %f\n", point1.getDistance(point2));
    }
}

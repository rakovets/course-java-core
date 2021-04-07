package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point point1 = new Point(10, 20);
        Point point2 = new Point(30, 40);
        System.out.printf("Points : X1 = %s Y1 = %s ", point1.getX(), point1.getY());
        System.out.printf("X2 = %s Y2 = %s\n", point2.getX(), point2.getY());
        System.out.printf("distance = %f\n", point1.getDistance(point2));
    }
}

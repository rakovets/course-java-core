package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointTest {
    public static void main(String[] args) {
        Point testPointA = new Point(2, 3);
        Point testPointB = new Point(4, 6);

        System.out.printf("Point A coordinates are x = %s and y = %s.%n", testPointA.getX(), testPointA.getY());
        System.out.printf("Point B coordinates are x = %s and y = %s.%n", testPointB.getX(), testPointB.getY());
        System.out.printf("Distance between A and B is %s.%n", testPointA.getDistance(testPointB));

        testPointA.setX(6);
        testPointA.setY(10);

        System.out.println();
        System.out.printf("Point A coordinates are x = %s and y = %s.%n", testPointA.getX(), testPointA.getY());
        System.out.printf("Point B coordinates are x = %s and y = %s.%n", testPointB.getX(), testPointB.getY());
        System.out.printf("Distance between A and B is %s.%n", testPointA.getDistance(testPointB));
    }
}

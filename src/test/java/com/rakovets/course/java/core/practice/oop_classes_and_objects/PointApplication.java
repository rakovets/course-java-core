package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointApplication {
    public static void main(String[] args) {
        Point point1 = new Point(4, 3);
        Point point2 = new Point(5, 7);
        System.out.println("Distance between points: " + point1.getDistance(point2));
    }
}

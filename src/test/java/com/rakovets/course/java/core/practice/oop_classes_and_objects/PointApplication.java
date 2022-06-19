package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointApplication {
    public static void main(String[] args) {
        Point dot = new Point(2, 2);
        System.out.println("Point coordinates: " + dot.getX() + "," + dot.getY());
        dot.setX(3);
        dot.setY(3);
        System.out.println("Point coordinates: " + dot.getX() + "," + dot.getY());

        Point anotherPoint = new Point(2, 2);
        System.out.println(dot.getDistance(anotherPoint));
    }
}

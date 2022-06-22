package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointApplication {
    public static void main(String[] args) {
        Point point = new Point(4, 3);
        System.out.println("Point (" + point.getPointX() + "; " + point.getPointY() + ").");
        Math Solution;
        double distance = Math.sqrt(Math.pow(point.getPointX(), 2) + Math.pow(point.getPointY(), 2));
        System.out.println("Distance: " + distance);
    }
}

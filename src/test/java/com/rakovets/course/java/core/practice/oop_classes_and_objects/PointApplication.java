package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointApplication {
    public static void main(String[] args) {
        Point point = new Point(6, 12);
        System.out.println("x: " + point.get_X() + ", y: " + point.get_Y());
        point.set_X(2);
        point.set_Y(6);
        System.out.println("New coordinates x: " + point.get_X() + ", y: " + point.get_Y());
        System.out.println("Distance from the point " + point.getDistance(new Point(9, 7)));
    }
}

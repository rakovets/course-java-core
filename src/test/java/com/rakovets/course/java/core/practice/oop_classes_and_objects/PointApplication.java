package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointApplication {
    public static void main(String[] args) {
        Point point = new Point(5, 4);
        System.out.println(point.getDistance(new Point(3, 2)));
    }

}

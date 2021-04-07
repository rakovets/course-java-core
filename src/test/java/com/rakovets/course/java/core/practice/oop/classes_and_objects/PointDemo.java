package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        Point pointOne = new Point(2, 2);
        System.out.println("Distance = " + pointOne.getDistance(new Point(2, 7)));
    }
}

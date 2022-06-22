package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointApplication {
    public static void main(String[] args) {
        Point one = new Point(15, 10);
        one.setX(2);
        one.setY(3);

        System.out.println("X: " + one.getX());
        System.out.println("Y: " + one.getY());

        Point two = new Point(0, 0);
        two.setX(-6);
        two.setY(-3);

        System.out.println("X: " + two.getX());
        System.out.println("Y: " + two.getY());

        one.getDistance(two);

        System.out.println("Distance between points: " + one.getDistance(two));
    }

}

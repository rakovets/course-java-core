package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointApplication {
    public static void main(String[] args) {
        Point pointFirst = new Point(5, 10);
        Point pointSecond = new Point(2, -15);

        System.out.println("First point: X = " + pointFirst.getX() + "; Y = " + pointFirst.getY());
        System.out.println("Second point: X = " + pointSecond.getX() + "; Y = " + pointSecond.getY());
        System.out.println("Distance between points: " + pointFirst.getDistance(pointSecond));
        System.out.println();

        pointFirst.setX(33);
        pointFirst.setY(-2);
        pointSecond.setX(1);
        pointSecond.setY(-23);

        System.out.println("First point: X = " + pointFirst.getX() + "; Y = " + pointFirst.getY());
        System.out.println("Second point: X = " + pointSecond.getX() + "; Y = " + pointSecond.getY());
        System.out.println("Distance between points: " + pointFirst.getDistance(pointSecond));
    }
}

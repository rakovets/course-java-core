package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointTest {
    public static void main(String[] args) {

        double x = 1;
        double y = 2;
        Point point = new Point(x, y);

        System.out.printf("\nx:%.2f y:%.2f\n", point.getX(), point.getY());

        x = 5;
        y = 9;

        point.setX(x);
        point.setY(y);

        System.out.printf("\nx:%.2f y:%.2f\n", point.getX(), point.getY());

        x = 6;
        y = 15;
        Point instancePoint = new Point(x, y);

        System.out.printf("\n%.2f\n", point.getDistance(instancePoint));
    }
}

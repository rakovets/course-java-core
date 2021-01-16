package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point(-4, -3);
        Point p2 = new Point(1, 2);
        System.out.println(p1.getDistance(p2));

        p1.setX(12);
        p1.setY(-10);
        System.out.printf("x=%d and y=%d\n", p1.getX(), p1.getY());

        p2.setX(-65);
        p2.setY(-1);
        System.out.printf("x=%d and y=%d\n", p2.getX(), p2.getY());

        System.out.println(p1.getDistance(p2));
    }
}

package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class PointTest {
    public static void main(String[] args) {

        Point firstPoint = new Point(2, 3);
        System.out.println(firstPoint.getX() + " " + firstPoint.getY());
        firstPoint.setX(5);
        firstPoint.setY(1);
        System.out.println(firstPoint.getX() + " " + firstPoint.getY());

        Point secondPoint = new Point(5, 10);
        System.out.println(firstPoint.distance(secondPoint));
    }
}

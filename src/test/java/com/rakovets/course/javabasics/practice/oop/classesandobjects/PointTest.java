package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(20,30);
        System.out.printf("X: %f, Y: %f", point.x, point.y);
        point.setX(15);
        point.setY(15);
        System.out.printf("\nAfter changes\nX: %f, Y: %f", point.x, point.y);
    }
}
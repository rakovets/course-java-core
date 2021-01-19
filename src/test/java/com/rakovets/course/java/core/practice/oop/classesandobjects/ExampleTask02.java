package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class ExampleTask02 {
    public static void main(String[] args) {
        Point firstPoint = new Point(5.0, 5.0);
        Point secondPoint = new Point(11.0, 5.1);
        System.out.print(firstPoint.distance(secondPoint));
    }
}


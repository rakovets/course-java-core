package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class PointDemo {
    public static void main(String[] args) {
        System.out.println("**Sample for getters, setters and constructor**");
        Point point01 = new Point(3, 4);
        System.out.println(point01.getX());
        System.out.println(point01.getY());
        System.out.println("---");
        point01.setX(9);
        point01.setY(15);
        System.out.println(point01.getX());
        System.out.println(point01.getY());

        System.out.println("\n**Sample for \"getDistance\" method**");
        Point point02 = new Point(3, 4);
        Point point03 = new Point(7, 1);
        System.out.println(point02.getDistance(point03));
    }
}

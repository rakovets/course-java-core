package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import java.awt.geom.Point2D;

public class PointDemo {
    public static void main(String[] args) {
        System.out.println("**Sample for getters, setters and constructor**");
        Point sample01 = new Point(3, 4);
        System.out.println(sample01.getX());
        System.out.println(sample01.getY());
        System.out.println("---");
        sample01.setX(9);
        sample01.setY(15);
        System.out.println(sample01.getX());
        System.out.println(sample01.getY());

        System.out.println("\n**Sample for \"getDistance\" method**");
        Point sample02 = new Point(3, 4);
        Point sample03 = new Point(7, 1);
        System.out.println(sample02.getDistance(sample03));

    }
}

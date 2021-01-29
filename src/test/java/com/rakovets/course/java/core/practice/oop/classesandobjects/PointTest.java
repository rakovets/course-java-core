package com.rakovets.course.java.core.practice.oop.classesandobjects;

import com.rakovets.course.java.core.example.oop.classesandobjects.Point;

public class PointTest {
    public static void main(String[] args) {
        Point a = new Point(7, 9);

        System.out.println(a.getX() + " " + a.getY());
        System.out.println(a.distance(new Point(9, 11)));
    }
}

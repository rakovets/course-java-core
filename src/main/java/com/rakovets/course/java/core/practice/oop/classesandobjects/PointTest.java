package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class PointTest {
    public static void main(String[] args) {
        Point A = new Point(3,7);
        Point B = new Point(6,3);
        System.out.println(A.getDistance(B));
    }
}

package com.rakovets.course.java.core.practice.oop.classesandobjects;

public class PointInizialization {
    public static void main(String[] args) {
        Point a = new Point(3, 7);
        System.out.println(a.getX() + " " + a.getY());
        a.setX(5);
        a.setY(5);
        System.out.println(a.getX() + " " + a.getY());
        System.out.println(a.distance(new Point(-7,-9)));
    }
}

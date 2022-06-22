package com.rakovets.course.java.core.practice.oop_classes_and_objects;

public class Point {
    private double pointX;
    private double pointY;

    public Point (double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public double getPointX() {
        return this.pointX;
    }

    public double getPointY() {
        return this.pointY;
    }
}

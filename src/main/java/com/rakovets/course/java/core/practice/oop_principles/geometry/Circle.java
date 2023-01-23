package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class Circle {
    private final double RADIUS;

    public Circle(double radius) {
        this.RADIUS = radius;
    }

    public double area() {
        return Math.PI * Math.pow(getRADIUS(), 2);
    }

    public double length() {
        return 2 * Math.PI * getRADIUS();
    }

    public double getRADIUS() {
        return RADIUS;
    }
}

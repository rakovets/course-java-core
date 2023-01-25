package com.rakovets.course.java.core.practice.oop_principles.geometryTest;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double length() {
        return 2 * Math.PI * getRadius();
    }

    public double getRadius() {
        return radius;
    }
}

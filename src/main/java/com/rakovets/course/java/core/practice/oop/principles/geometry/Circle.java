package com.rakovets.course.java.core.practice.oop.principles.geometry;

public class Circle implements TwoDimensionalShapes {
    private static double radius;

    public Circle(double radius) {
        Circle.radius = radius;
    }

    public static double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        Circle.radius = radius;
    }

    @Override
    public double getArea() {
        return calculateArea();
    }

    private double calculateArea() {
        return Math.round(((radius * radius * Math.PI) * 10) / 10);
    }

    @Override
    public boolean getEquals() {
        return calculateArea() == getArea();
    }

    @Override
    public String toString() {
        return "radius " + radius + ", area " + calculateArea();
    }
}

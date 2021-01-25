package com.rakovets.course.java.core.practice.oop.principles.geometry;

public class Triangle implements TwoDimensionalShapes {
    private static double base;
    private static double height;

    public Triangle(double base, double height) {
        Triangle.base = base;
        Triangle.height = height;
    }

    public static double getBase() {
        return base;
    }

    public void setBase(double base) {
        Triangle.base = base;
    }

    public static double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        Triangle.height = height;
    }

    @Override
    public double getArea() {
        return calculateArea();
    }

    private double calculateArea() {
        return base * height / 2;
    }

    @Override
    public boolean getEquals() {
        return calculateArea() == getArea();
    }

    @Override
    public String toString() {
        return "triangle area: " + calculateArea();
    }
}

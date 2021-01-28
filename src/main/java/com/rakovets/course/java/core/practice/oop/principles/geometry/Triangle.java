package com.rakovets.course.java.core.practice.oop.principles.geometry;

public class Triangle implements TwoDimensionalShapes {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
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

package com.rakovets.course.java.core.practice.oop.principles.geometry;

public class Cylinder implements ThreeDimensionalShapes {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getArea() {
        return calculateArea();
    }

    private double calculateArea() {
        return Math.round(((2 * Math.PI * radius * height + 2 * Math.PI * radius * radius) * 10) /
                10);
    }

    @Override
    public double getVolume() {
        return Math.round(((Math.PI * radius * radius * height) * 10) / 10);
    }

    @Override
    public boolean getEquals() {
       return calculateArea() == getArea();
    }

    @Override
    public String toString() {
        return "cylinder volume: " + getVolume() + ", area: " + calculateArea();
    }
}

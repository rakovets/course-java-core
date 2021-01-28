package com.rakovets.course.java.core.practice.oop.principles.geometry;

public class Cube implements ThreeDimensionalShapes {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return calculateArea();
    }

    private double calculateArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }

    @Override
    public boolean getEquals() {
       return calculateArea() == getArea();
    }

    @Override
    public String toString() {
        return "side " + side + ", area " + calculateArea();
    }
}

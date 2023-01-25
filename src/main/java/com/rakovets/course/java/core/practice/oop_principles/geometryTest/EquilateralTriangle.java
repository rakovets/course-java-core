package com.rakovets.course.java.core.practice.oop_principles.geometryTest;

public class EquilateralTriangle extends Figure {
    private final double sideA;

    public EquilateralTriangle(double sideA) {
        this.sideA = sideA;
    }

    public double area() {
        return Math.pow(getSideA(), 2) * Math.sqrt(3) / 4;
    }

    public double perimeter() {
        return 3 * getSideA();
    }

    @Override
    public String toString() {
        return null;
    }

    public double getSideA() {
        return sideA;
    }

}

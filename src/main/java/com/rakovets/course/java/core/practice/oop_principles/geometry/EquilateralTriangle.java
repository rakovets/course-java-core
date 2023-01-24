package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class EquilateralTriangle implements MainUtils {
    private final double SIDE_A;

    public EquilateralTriangle(double sideA) {
        this.SIDE_A = sideA;
    }

    public double area() {
        return Math.pow(getSideA(), 2) * Math.sqrt(3) / 4;
    }

    public double perimeter() {
        return 3 * getSideA();
    }

    public double getSideA() {
        return SIDE_A;
    }
}

package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class Triangle extends IsoscelesTriangle {
    private final double SIDE_C;

    public Triangle(int sideA, int sideB, double sideC) {
        super(sideA, sideB);
        this.SIDE_C = sideC;
    }

    public double getSIDE_C() {
        return SIDE_C;
    }
}

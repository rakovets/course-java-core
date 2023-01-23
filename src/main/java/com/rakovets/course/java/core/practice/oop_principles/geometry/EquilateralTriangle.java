package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class EquilateralTriangle extends Parallelogram {
    private final double ANGLE_B;

    public EquilateralTriangle(int sideA, int sideB, double angleA, double angleB) {
        super(sideA, sideB, angleA);
        this.ANGLE_B = angleB;
    }

    @Override
    public double area() {

    }

    @Override
    public double perimeter() {

    }
}

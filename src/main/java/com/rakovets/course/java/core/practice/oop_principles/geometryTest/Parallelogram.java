package com.rakovets.course.java.core.practice.oop_principles.geometryTest;

public class Parallelogram extends Rhombus {
    private final int sideB;

    public Parallelogram(int sideA, int sideB, double angleA) {
        super(sideA, angleA);
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return getSideA() * getSideB() * Math.sin(Math.toRadians(getAngleA()));
    }

    public int getSideB() {
        return sideB;
    }
}

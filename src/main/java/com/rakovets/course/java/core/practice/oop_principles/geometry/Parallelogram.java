package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class Parallelogram extends Rhombus {
    private final int SIDE_B;

    public Parallelogram(int sideA, int sideB, double angleA) {
        super(sideA, angleA);
        SIDE_B = sideB;
    }

    @Override
    public double area() {
        return getSideA() * getSideB() * Math.sin(Math.toRadians(getAngleA()));
    }

    public int getSideB() {
        return SIDE_B;
    }
}

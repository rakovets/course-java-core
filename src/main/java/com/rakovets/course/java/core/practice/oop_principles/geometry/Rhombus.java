package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class Rhombus extends Square {
    private final double ANGLE_A;
    private final double ANGLE_B;

    public Rhombus(int sideA, double angleA) {
        super(sideA);
        this.ANGLE_A = angleA;
        this.ANGLE_B = 180 - angleA;
    }

    @Override
    public double area() {
        return Math.pow(getSideA(), 2) * Math.sin(Math.toRadians(getAngleA()));
    }

    public double getAngleA() {
        return ANGLE_A;
    }

    public double getAngleB() {
        return ANGLE_B;
    }
}

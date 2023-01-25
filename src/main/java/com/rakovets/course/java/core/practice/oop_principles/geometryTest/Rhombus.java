package com.rakovets.course.java.core.practice.oop_principles.geometryTest;

public class Rhombus extends Square {
    private final double angleA;
    private final double angleB;

    public Rhombus(int sideA, double angleA) {
        super(sideA);
        this.angleA = angleA;
        this.angleB = 180 - angleA;
    }

    @Override
    public double area() {
        return Math.pow(getSideA(), 2) * Math.sin(Math.toRadians(getAngleA()));
    }

    public double getAngleA() {
        return angleA;
    }

    public double getAngleB() {
        return angleB;
    }
}

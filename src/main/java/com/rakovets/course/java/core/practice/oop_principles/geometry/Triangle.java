package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class Triangle extends IsoscelesTriangle {
    private final double sideC;
    private final int angleA;
    private final int angleB;
    private final int angleC;

    public Triangle(int sideA, int sideB, double sideC, int angleA, int angleB) {
        super(sideA, sideB);
        this.sideC = sideC;
        this.angleA = angleA;
        this.angleB = angleB;
        this.angleC = 180 - angleA - angleB;
    }

    public int getAngleA() {
        return angleA;
    }

    public int getAngleB() {
        return angleB;
    }

    public int getAngleC() {
        return angleC;
    }

    public double getSideC() {
        return sideC;
    }
}

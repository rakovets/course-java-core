package com.rakovets.course.java.core.practice.oop_principles.geometry;

public class Parallelogram extends Rectangle {
    private double angleA;
    private double angleB;

    public Parallelogram(int sideA, int sideB, double angleA) {
        super(sideA, sideB);
        this.angleA = angleA;
        this.angleB = 180 - angleA;
    }

    @Override
    public double area() {
        return getSideA() * getSideB() * Math.sin(Math.toRadians(angleA));
    }

    public double getAngleA() {
        return angleA;
    }

    public void setAngleA(double angleA) {
        this.angleA = angleA;
    }

    public double getAngleB() {
        return angleB;
    }

    public void setAngleB(double angleB) {
        this.angleB = angleB;
    }
}
